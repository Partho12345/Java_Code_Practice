import java.util.*;
public class KthNodeInorderTrav {		//	10.9
	public static BinaryTreeNode<Integer> findKthNodeBinaryTree(BinaryTreeNode<Integer> tree, int k) {
		BinaryTreeNode<Integer> iter= tree;
		while(iter!= null) {
			int leftSize= iter.left!=null ? iter.left.size : 0;
			if(leftSize+1 < k) { 
				k-=(leftSize+1);
				iter= iter.right;
			}else if(leftSize== k-1) { 
				return iter;
			}else { 
				iter= iter.left;
			}
		}return null;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		BinaryTreeNode<Integer>t= new BinaryTreeNode<>(10);
		t.left= new BinaryTreeNode<>(20);
		t.left.left= new BinaryTreeNode<>(30);
		t.left.right= new BinaryTreeNode<>(40);
		t.right= new BinaryTreeNode<>(50);
		t.right.left= new BinaryTreeNode<>(60);
		t.right.right= new BinaryTreeNode<>(70);
		int k=3;
		System.out.println("Inorder traversal for Node k="+k+" is: "+(findKthNodeBinaryTree(t, k)).data);
	}

}

//	OUTPUT...
//	Inorder traversal for Node k=3 is: 70