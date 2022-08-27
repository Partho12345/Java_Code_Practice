import java.util.Iterator;

public class LinkedList {
	public static ListNode<Integer> insert(int d, ListNode node){
		ListNode<Integer> newNode= new ListNode<Integer>(d);
		newNode.next= node.next;
		node.next= newNode;
		return node;
	}
	public static void display(ListNode node) {
		while(node!=null) {
			System.out.println("->"+node.data);
			node= node.next;
		}
	}
	public static void deleteList(ListNode A) {
		A.next= A.next.next;
	}
	public static ListNode<Integer> search(ListNode L, Integer key){
		while(L!=null && L.data!=key) {
			L=L.next;
		}return L;
	}
	
	public ListNode head;
	void main(String[] args) {
		ListNode<Integer> head= new ListNode<>(1);
		for(int i=0; i<10; i++) {
			head= insert(i+2, head);
		}
		head=search(head, 10);
		display(head);
	}
	public void push(char c) {
		// TODO Auto-generated method stub
		
	}
	public void printList(ListNode head2) {
		// TODO Auto-generated method stub
		
	}
	public boolean isPalindrome(ListNode head2) {
		// TODO Auto-generated method stub
		return false;
	}
	public void add(int i, String string) {
		// TODO Auto-generated method stub
		
	}
	public void addLast(String string) {
		// TODO Auto-generated method stub
		
	}
	public void addFirst(String string) {
		// TODO Auto-generated method stub
		
	}
	public void add(String string) {
		// TODO Auto-generated method stub
		
	}
	public void removeLast() {
		// TODO Auto-generated method stub
		
	}
	public void removeFirst() {
		// TODO Auto-generated method stub
		
	}
	public void remove(int i) {
		// TODO Auto-generated method stub
		
	}
	public void remove(String string) {
		// TODO Auto-generated method stub
		
	}
	public Iterator descendingIterator() {
		// TODO Auto-generated method stub
		return null;
	}
}
