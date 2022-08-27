
public class DelNode {
	public static void deleteNode(ListNode<Integer> node) {
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
	private static ListNode<Integer> temp;
	public static void main(String[] args) {
		System.out.print("LinkedList:\t");
		ListNode<Integer> L= new ListNode<>(0);
		for(int i=5; i>0; i--) {
			L= insert(i+1, L);
		}
		display(L);
		int n=5;
		ListNode<Integer>temp= L; 
		for(int i=1; i<n; i++) {
			temp= temp.next;
		}deleteNode(temp);
		System.out.print("\nAfter Deletion:\t");
		display(L);
	}

}
