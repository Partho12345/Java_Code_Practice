import java.util.*;
public class RemoveDuplicates {
	public static void display(ListNode node) {
		while(node!=null) {
			System.out.print("->"+node.data);
			node= node.next;
		}
	}
		public static ListNode<Integer> insert(int d, ListNode node){
			ListNode<Integer> newNode= new ListNode<Integer>(d);
			newNode.next= node.next;
			node.next= newNode;
			return node;
		}
	public static ListNode <Integer> removeDuplicates(ListNode <Integer> L) 
	{
		ListNode <Integer> iter = L;
		while (iter != null) 
		{
		ListNode <Integer> nextDistinct = iter.next;
		while (nextDistinct != null && nextDistinct.data == iter.data) {
		nextDistinct = nextDistinct . next ;
		}
		iter.next = nextDistinct ;
		iter = nextDistinct;
		}
		return L;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ListNode<Integer> head= new ListNode(1);
		ListNode<Integer> head1= new ListNode(23);
		ListNode<Integer> head2= new ListNode(67);
		ListNode<Integer> head3= new ListNode(67);
		ListNode<Integer> head4= new ListNode(59);
		ListNode<Integer> head5= new ListNode(59);
		head.next=head1;
		head1.next=head2;head2.next=head3;head3.next=head4;head4.next=head5;
		   for(int i=2;i>0;i--)
			    head=insert(i,head);
		   System.out.print("LinkedList:\t");
		   display(head);
		   removeDuplicates(head);
		   System.out.print("\nAfter Deletion of Duplicates:\t");
		   display(head);
	}

}