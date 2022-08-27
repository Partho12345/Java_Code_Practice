
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