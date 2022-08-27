import java.util.*;
public class FrstKeyGreaterThanK {		//	15.2
	public static BSTNode<Integer> findFirstGreaterThanK(BSTNode<Integer>subtree, Integer k) {
		BSTNode<Integer> firstSoFar= null;
		while(subtree != null) {
			if(subtree.data > k) {
				firstSoFar = subtree;
				subtree = subtree.left;
			}else {
				subtree = subtree.right;
			}
		}return firstSoFar;
	}
	public static void Inorder(BSTNode<Integer> tree) {
		if(tree!= null) {
			Inorder(tree.left);
			System.out.print(tree.data+" ");
			Inorder(tree.right);
		}
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		BSTNode<Integer>t = new BSTNode<>(8);
	    t.left= new BSTNode<>(3);
	    t.left.left= new BSTNode<>(4);
	    t.right= new BSTNode<>(9);
	    t.right.left= new BSTNode<>(6);
	    t.right.right= new BSTNode<>(7);
	    System.out.print("Given BST= "); Inorder(t);
	    int k=3;
	    System.out.println("\nFirst key greater than "+k+" is: "+findFirstGreaterThanK(t, k).data);
	}

}
