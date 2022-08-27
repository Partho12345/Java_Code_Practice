import java.util.*;
public class ListFromLeavesOfBT {		//	10.14
	private static void printLeaves(BinaryTreeNode<Integer> tree) {
		// TODO Auto-generated method stub
		if(tree == null) {
			return; 
		}if(tree.left==null && tree.right==null) { 
			System.out.print(tree.data+" ");
		}
		printLeaves(tree.left);
		printLeaves(tree.right);
	}

	public static void main(String[] args) throws Exception{
		// TODO Auto-generated method stub
		BinaryTreeNode<Integer> t= new BinaryTreeNode<Integer>(7);
		t.left= new BinaryTreeNode<Integer>(6);
		t.right= new BinaryTreeNode<Integer>(5);
		t.left.left= new BinaryTreeNode<Integer>(4);
		t.left.right= new BinaryTreeNode<Integer>(3);
		t.right.left= new BinaryTreeNode<Integer>(2);
		t.right.right= new BinaryTreeNode<Integer>(1);
		System.out.print("Leaves of the given binary tree: ");
		printLeaves(t);
	}

}
	
//	OUTPUT...
//	Leaves of the given binary tree: 4 3 2 1 