import java.util.*;
public class ComputeExterior {		//	10.15
	public static void exteriorBinaryTree(BinaryTreeNode<Integer> subtreeRoot) {
		if(subtreeRoot== null) {
			return;
		}
		System.out.print(subtreeRoot.data + " ");
		leftBoundaryAndLeaves(subtreeRoot.left);
		isLeaf(subtreeRoot.left);
		isLeaf(subtreeRoot.right);
		rightBoundaryAndLeaves(subtreeRoot.right);
	}
	private static void leftBoundaryAndLeaves(BinaryTreeNode<Integer> subtreeRoot) {
		if(subtreeRoot == null) {
			return;
		}
		if(subtreeRoot.left != null) {
			System.out.print(subtreeRoot.data+" ");
			leftBoundaryAndLeaves(subtreeRoot.left);
		}
		else if(subtreeRoot.right != null) {
			System.out.print(subtreeRoot.data+" ");
			leftBoundaryAndLeaves(subtreeRoot.right);
		}
	}
	private static void rightBoundaryAndLeaves(BinaryTreeNode<Integer> subtreeRoot) {
		if(subtreeRoot == null) {
			return;
		}
		if (subtreeRoot.right != null) {
			rightBoundaryAndLeaves(subtreeRoot.right);
			System.out.print(subtreeRoot.data+" ");
		}
		else if (subtreeRoot.left != null) {
			rightBoundaryAndLeaves(subtreeRoot.left);
			System.out.print(subtreeRoot.data+" ");
		}
	}
	private static void isLeaf(BinaryTreeNode<Integer> subtreeRoot) {
		if (subtreeRoot == null)
			return;
		isLeaf(subtreeRoot.left);
		if(subtreeRoot.left == null && subtreeRoot.right == null) {
			System.out.print(subtreeRoot.data+" ");
		}isLeaf(subtreeRoot.right);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		BinaryTreeNode<Integer> t= new BinaryTreeNode<Integer>(7);
		t.left= new BinaryTreeNode<Integer>(6);
		t.right= new BinaryTreeNode<Integer>(5);
		t.left.left= new BinaryTreeNode<Integer>(4);
		t.left.right= new BinaryTreeNode<Integer>(3);
		t.right.left= new BinaryTreeNode<Integer>(2);
		t.right.right= new BinaryTreeNode<Integer>(1);
		t.right.left.left= new BinaryTreeNode<Integer>(8);
		t.right.left.right= new BinaryTreeNode<Integer>(9);
		System.out.print("Exterior of the given binary tree: ");
		exteriorBinaryTree(t);
	}

}

//	OUTPUT...
//	Exterior of the given binary tree: 7 6 4 3 8 9 1 5 