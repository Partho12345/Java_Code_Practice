import java.util.*;
public class BTfromInorderPreorder {		//	10.12
	public class BinaryTreeNode {
		BinaryTreeNode left;
		BinaryTreeNode right;
		int data;
		public BinaryTreeNode(int data) {
			this.data = data;
		}
	}

	public BinaryTreeNode binaryTreeFromPreorderInorder(int[] preorder, int[] inorder) {
		return binaryTreeFromPreorderInorderHelper(inorder, 0, inorder.length-1, preorder, 0, preorder.length-1);
	}
	public int searchInorder(int[] inorder, int inorderStart, int inorderEnd, int data) {
		for(int i=inorderStart; i<=inorderEnd; i++) {
			if(data==inorder[i]) 
				return i;
		}return -1;
	}
	public BinaryTreeNode binaryTreeFromPreorderInorderHelper(int[] inorder, int inorderStart, int inorderEnd, int[] preorder, int preorderStart, int preorderEnd) {
		if(preorderEnd < preorderStart || inorderEnd < inorderStart) {
			return null;        
		}BinaryTreeNode tree = new BinaryTreeNode(preorder[preorderStart]);
		int rootInorderIndex = searchInorder(inorder, inorderStart, inorderEnd, tree.data);
		int leftSubtreeSize = rootInorderIndex - inorderStart;
		int rightSubtreeSize = inorderEnd - rootInorderIndex; 
		tree.right= binaryTreeFromPreorderInorderHelper(inorder, rootInorderIndex + 1, inorderEnd, preorder, preorderStart + 1 + leftSubtreeSize, preorderStart + leftSubtreeSize + rightSubtreeSize );                          
		tree.left= binaryTreeFromPreorderInorderHelper(inorder, inorderStart, rootInorderIndex - 1, preorder, preorderStart + 1, preorderStart + leftSubtreeSize);                                
		return tree;                                
	}
	public static void Preorder(BinaryTreeNode tree) {
		if(tree!= null) {
			System.out.print(tree.data+" ");
			Preorder(tree.left);
			Preorder(tree.right);
		}
	}
	public static void Inorder(BinaryTreeNode tree) {
		if(tree!= null) {
			Inorder(tree.left);
			System.out.print(tree.data+" ");
			Inorder(tree.right);
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		BTfromInorderPreorder res = new BTfromInorderPreorder();
		int[] preorder={8, 1, 3, 4, 2, 5, 6};
		int[] inorder= {3, 1, 4, 8, 5, 2, 6};
		System.out.println("Before Recontruction:-"+"\nInorder = "+Arrays.toString(inorder)+"\nPreorder= "+Arrays.toString(preorder));
		BinaryTreeNode tree= res.binaryTreeFromPreorderInorder(preorder, inorder);
		System.out.print("\nAfter Reconstruction:-\nInorder = ");
		res.Inorder(tree);
		System.out.print("\nPreorder= ");
		res.Preorder(tree);
	}
	
}
//	OUTPUT...
//	Before Recontruction:-
//	Inorder = [3, 1, 4, 8, 5, 2, 6]
//	Preorder= [8, 1, 3, 4, 2, 5, 6]
//
//	After Reconstruction:-
//	Inorder = 3 1 4 8 5 2 6 
//	Preorder= 8 1 3 4 2 5 6 