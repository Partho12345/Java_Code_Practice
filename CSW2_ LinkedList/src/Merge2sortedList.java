
public class Merge2sortedList {
	public static ListNode<Integer> merge(ListNode<Integer> L1, ListNode<Integer> L2) {
		ListNode<Integer> dummyHead = new ListNode<>(0);
		ListNode<Integer> merged = dummyHead;
		ListNode<Integer> P1 = L1, P2 = L2;
		while(P1 != null && P2 != null) {
			if(P1.data < P2.data) {
				merged.next = P1;
				P1 = P1.next;
			}else {
				merged.next = P2;
				P2 = P2.next;
			}
			merged = merged.next;
		}
		if(P1 != null) {
			merged.next = P1;
		} else if(P2 != null) {
			merged.next = P2;
		} 
		return dummyHead.next;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.print("\nLinkedList1 : ");
		ListNode<Integer> head1= new ListNode<>(0);
		for(int i=5; i>0; i--) {
			head1= insert(i+2, head1);
			display(head1);
		}
		System.out.print("\nLinkedlist2 : ");
		ListNode<Integer> head2= new ListNode<>(1);
		for(int i=10; i>5; i--) {
			insert(i+3, head2);
			display(head1);
		}
		System.out.print("\nLinkedList sorted node1 and node2 : ");
		ListNode<Integer> head3= new ListNode<>(1);
		head3= merge(head1,head2);
		display(head3);
	}

	private static void display(ListNode<Integer> node) {
		// TODO Auto-generated method stub
		while(node!=null) {
			System.out.print("->"+node.data);
			node= node.next;
		}
	}
	private static ListNode<Integer> insert(int d, ListNode<Integer> node) {
		// TODO Auto-generated method stub
		ListNode<Integer> newNode= new ListNode<Integer>(d);
		newNode.next= node.next;
		node.next= newNode;
		return node;
	}

}
