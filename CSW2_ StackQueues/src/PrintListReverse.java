import java.util.*;

class ListNode<T> {
	public T data;
	public ListNode<T> next;

	public ListNode(T data) {
		this.data = data;
	}

	public ListNode(T data, ListNode<T> node) {
		this.data = data;
		this.next = node;
	}

}

public class PrintListReverse {
	public static void printLinkedListlnReverse(ListNode<Integer> head) {
		Deque<Integer> nodes = new LinkedList<>();
		while (head != null) {
			nodes.addFirst(head.data);
			head = head.next;
		}
		while (!nodes.isEmpty()) {
			System.out.print(nodes.poll() + " ");
		}
	}

	public static ListNode<Integer> createList(int... array) {
		ListNode<Integer> node = new ListNode<Integer>(0);
		ListNode<Integer> tmpNode = node;
		for (int x : array) {
			ListNode<Integer> new_node = new ListNode<Integer>(x);
			tmpNode.next = new_node;
			tmpNode = tmpNode.next;
		}
		return node.next;
	}

	public static String display(ListNode<Integer> node) {
		String result = "";
		while (node != null) {
			result += node.data + " ";
			node = node.next;
		}
		return result;
	}

	public static void main(String[] args) {
		ListNode<Integer> ls = createList(1, 2, 3, 4, 5);
		System.out.println("List: \n" + display(ls));
		System.out.println("Print in Reverse List :");
		printLinkedListlnReverse(ls);

	}

}