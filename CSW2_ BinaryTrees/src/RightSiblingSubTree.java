
public class RightSiblingSubTree {		//	10.16
	public static BinaryTreeNode<Integer> getSibling(BinaryTreeNode<Integer> node, int key) {
		if(node==null || node.data==key) {
			return null;
		}
		if(node.left!=null && node.left.data==key) {
			return node.right;
		}
		if(node.right!=null && node.right.data==key) {
			return node.left;
		}
		BinaryTreeNode<Integer> l= getSibling(node.left, key);
		if(l != null) {
			l= getSibling(node.right, key);
		}return l;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		BinaryTreeNode<Integer> t= new BinaryTreeNode<Integer>(1);
		t.left= new BinaryTreeNode<Integer>(2);
		t.right= new BinaryTreeNode<Integer>(4);
		t.left.left= new BinaryTreeNode<Integer>(3);
		t.right.right= new BinaryTreeNode<Integer>(5);
		int key=2;
		System.out.println("Right sibling subtree of "+key+" is: "+getSibling(t,key).data);
	}

}
//	OUTPUT
//	Right sibling subtree of 2 is: 4