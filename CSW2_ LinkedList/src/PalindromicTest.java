
public class PalindromicTest {

	public static boolean isPalindrome(ListNode L) {
		if(L==null) {
			return true ;
		}
		ListNode slow = L, fast = L;
		while(fast!=null && fast.next!=null) {
			fast= fast.next.next;
			slow= slow.next;
		}
		ListNode A = L;
		ListNode B= revLinkedList(slow);
		while(B!=null && A!=null) {
			if(B.data != A.data) {
				return false ;
			}
			B= B.next; A= A.next ;
		}return true ;
	}
	private static ListNode head;

	public static ListNode revLinkedList(ListNode L){
		if(L==null || L.next==null){
			head= L;
			return L;
		}
		else {
			revLinkedList(L.next);
			L.next.next= L;
			L.next= null;
			return head;
		}
	}
	private static void display(ListNode<Integer> node) {
		// TODO Auto-generated method stub
		while(node!=null) {
			System.out.print(node.data+" ");
			node= node.next;
		}
	}
	public static void main(String [] args){
		// TODO Auto-generated method stub
		ListNode L1= new ListNode(1);
		ListNode L2= new ListNode(2);
		ListNode L3= new ListNode(3);
		ListNode L4= new ListNode(2);
		ListNode L5= new ListNode(1);
		L1.next=L2; L2.next=L3; L3.next=L4; L4.next=L5;
		System.out.print("Given LinkedList: ");display(L1);
		System.out.println("\nIs it Palindrome: " + isPalindrome(L1));
	}

}
//	OUTPUT...
//	Given LinkedList: 1 2 3 2 1 
//	Is it Palindrome: true