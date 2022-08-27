
public class RemKthLastElem {
	private static ListNode<Integer> temp;
	private static void deleteNode(ListNode<Integer> node) {
		node.data = node.next.data;
		node.next = node.next.next;
	}
	private static void display(ListNode<Integer> node) {
		while(node!=null) {
			System.out.print("-->"+node.data);
			node= node.next;
		}
	}
	private static ListNode<Integer> insert(int d, ListNode<Integer> node) {
		ListNode<Integer> newNode= new ListNode<Integer>(d);
		newNode.next= node.next;
		node.next= newNode;
		return node;
	}
	public static void remNode(ListNode<Integer> list, int k) {
		ListNode<Integer> tmp = list;
		if(k<=1) {
			while(tmp.next.next != null) {
				tmp = tmp.next;
			}
			tmp.next = null;
			return;
		}
		ListNode<Integer> node = list.get(k);
		while(node.next != null) {
			tmp = tmp.next;
			node = node.next;
		}
		deleteNode(tmp);
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.print("Original List:  ");
		ListNode<Integer> L= new ListNode<>(0);
		int n=5;
		for(int i=n; i>0; i--) {
			L= insert(i+1, L);
		}
		display(L);
		int k=4;
		System.out.println("\nRemoving "+k+"th last element");
		ListNode<Integer>temp= L; 
		for(int i=k; i>1; i--) {
			temp= temp.next;
		}
		deleteNode(temp);
		System.out.print("Modified List:  ");
		display(L);
	}

}
