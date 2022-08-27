import java.util.*;
public class ComputeSuccessor {		//	10.10
	public static BinaryTreeNode<Integer> findSuccessor(BinaryTreeNode<Integer> node) {
		BinaryTreeNode<Integer>iter= node;
		if(iter.right!=null) {
			iter= iter.right;
			while(iter.left!= null) {
				iter= iter.left;
			}return iter;
		}
		while(iter.parent != null && iter.parent.right == iter) {
			iter= iter.parent;
		}return iter.parent;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		BinaryTreeNode<Integer>t= new BinaryTreeNode<>(3);
		t.left= new BinaryTreeNode<>(2);
		t.left.left= new BinaryTreeNode<>(1);
		t.left.right= new BinaryTreeNode<>(7);
		t.right= new BinaryTreeNode<>(5);
		t.right.left= new BinaryTreeNode<>(4);
		t.right.right= new BinaryTreeNode<>(6);
		System.out.println("The successsor of "+t.left.data+" is: "+findSuccessor(t.left).data);
	}

}
//	OUTPUT...
//	The successsor of 2 is: 7