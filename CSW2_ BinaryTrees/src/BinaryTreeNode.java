
public class BinaryTreeNode<T> {

//	public Object root;
	public int size;
	public T data;
	public BinaryTreeNode<T> left, right, parent;
	public BinaryTreeNode<Integer> next;
//	public int val;
	
    public BinaryTreeNode(T data) {
        this.data= data;
        left = right = null;
    }

    public BinaryTreeNode(T data, BinaryTreeNode<T> left, BinaryTreeNode<T> right,  BinaryTreeNode<T> parent) {
        this.data = data;
        this.left = left;
        this.right = right;
        this.parent = parent;
    }
	public BinaryTreeNode(Integer integer, BinaryTreeNode left2, BinaryTreeNode right2) {
		// TODO Auto-generated constructor stub
    }
	public boolean isLeaf() {
		// TODO Auto-generated method stub
		return false;
	}
}
