import java.util.*;
public class ReverseOrder {
	public static void revLinkedList(ListNode<Integer> head) {
		Deque<Integer> nodes = new LinkedList <>();
		while(head != null) {
			nodes.addFirst(head.data);
			head = head.next ;
		}
		while(!nodes.isEmpty()){
			System.out.println(nodes.poll()+" ");
		}
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
		ListNode<Integer> L= new LinkedList<>();
		for(int i=0; i<6; i++) {
			System.out.println(i);
		}
		System.out.println();
		revLinkedList(L);
	}

}
