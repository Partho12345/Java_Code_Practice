
public class CyclicityTest {
	
	public static ListNode<Integer> isCyclic(ListNode<Integer> head) {
		ListNode<Integer> fast=head, slow=head;
		while(fast!=null && fast.next!=null && fast.next.next!=null) {
			slow= slow.next; fast= fast.next.next;
			if(slow==fast) {
				slow=head;
				while(slow!=fast) {
					slow=slow.next;
					fast=fast.next;
				}return slow;
			}
		} return null; 
	}
	public static void Cycle(ListNode<Integer> head) {
		int k=1;
		ListNode<Integer> pNode=head;
		ListNode<Integer> temp=head;
		while(k++ <2) {
			pNode= pNode.next;
		}
		int c=0;
		while(temp.next!=null) {
			temp= temp.next;
			c++;
		}
		temp.next= pNode;
		temp= head;
		System.out.print("\nDisplay Cycle:\t");
		for(int i=0; i<=c+1;i++) {
			System.out.print("-->"+temp.data);
			temp=temp.next;
		}
	}
	private static void display(ListNode<Integer> node) {
		// TODO Auto-generated method stub
		while(node!=null) {
			System.out.print("-->"+node.data);
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
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.print("LinkedList\t");
		ListNode<Integer> head1=new ListNode<>(1);
		for(int i=7;i>0;i--) {
			head1=insert(i+4,head1);
		}
		display(head1);
		Cycle(head1);
		ListNode<Integer> node= isCyclic(head1);
		System.out.println("\nNode.data= "+node.data);
	}
}
