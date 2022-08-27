
public class RevSingleSubList {

	private static ListNode head;

	public static ListNode<Integer> revSublist(ListNode<Integer> L, int s, int f) {
        ListNode<Integer> dummyHead = new ListNode<>(0);
        ListNode<Integer> sub = dummyHead;
        int k=1;
        while(k++<s) {
        	sub=sub.next;
        }
//        sub = sub.get(s);
        ListNode<Integer> it = sub.next;
        while(s++<f) {
            ListNode<Integer> temp = it.next;
            it.next = temp.next;
            temp.next = sub.next;
            sub.next = temp;
        } return dummyHead.next;
    }
	private static ListNode<Integer> insert(int d, ListNode head) {
		// TODO Auto-generated method stub
		ListNode<Integer> newNode= new ListNode(d);
		newNode.next= head.next;
		head.next= newNode;
		return head;
	}
	private static void display(ListNode node) {
		// TODO Auto-generated method stub
		while(node!=null) {
			System.out.print("->"+node.data);
			node= node.next;
		}
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		for(int i=7; i>0; i--){
			head= insert(i+1, head);
			System.out.print("Given list= ");
			display(head);
		}
		revSublist(head,2,6);
		System.out.println("Rev List= ");
		display(head);
		
	}
	
}
