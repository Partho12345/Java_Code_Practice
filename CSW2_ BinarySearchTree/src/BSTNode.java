
public class BSTNode<T> {

	public int size;
	public T data;
	public BSTNode<T> left, right, parent;
	public BSTNode<Integer> next;

    public BSTNode(T data) {
        this.data= data;
        left = right = null;
    }

    public BSTNode(T data, BSTNode<T> left, BSTNode<T> right,  BSTNode<T> parent) {
        this.data = data;
        this.left = left;
        this.right = right;
        this.parent = parent;
    }
   
	public BSTNode(Integer integer, BSTNode left2, BSTNode right2) {
		// TODO Auto-generated constructor stub
    }
	public boolean isLeaf() {
		// TODO Auto-generated method stub
		return false;
	}

}
