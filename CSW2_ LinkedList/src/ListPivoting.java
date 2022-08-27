
public class ListPivoting {
	private static ListNode<Integer> head;
	public static ListNode<Integer> pivot(ListNode<Integer> list, int k) {
		ListNode<Integer> less = new ListNode<>(0);
		ListNode<Integer> equal = new ListNode<>(0);
		ListNode<Integer> greater = new ListNode<>(0);
		ListNode<Integer> lessItr = less;
		ListNode<Integer> equalItr = equal;
		ListNode<Integer> greaterItr = greater;
		ListNode<Integer> Itr = list;

		while(Itr != null) {
			if(Itr.data < k) {
				lessItr.next = Itr;
				lessItr = Itr;
			} else if(Itr.data == k) {
				equalItr.next = Itr;
				equalItr = Itr;
			} else {
				greaterItr.next = Itr;
				greaterItr = Itr;
			}
			Itr = Itr.next;
		}
		greaterItr.next = null;
		equalItr.next = greater.next;
		lessItr.next = equal.next;
		return less.next;
	}
	public static ListNode<Integer> insert(int d, ListNode node){
		ListNode<Integer> newNode= new ListNode<Integer>(d);
		newNode.next= node.next;
		node.next= newNode;
		return node;
	}
	private static void display(ListNode<Integer> node) {
		// TODO Auto-generated method stub
		while(node!=null) {
			System.out.print(node.data+" ");
			node= node.next;
		}
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ListNode L1= new ListNode(2);
		ListNode L2= new ListNode(2);
		ListNode L3= new ListNode(11);
		ListNode L4= new ListNode(7);
		ListNode L5= new ListNode(5);
		ListNode L6= new ListNode(11);
		L1.next=L2; L2.next=L3; L3.next=L4; L4.next=L5; L5.next=L6;
		System.out.print("Linked List: ");display(L1);
		int k=7;
		System.out.print("\nList Pivoting with key("+k+") will be : ");display(pivot(L1,k));
	}

}
