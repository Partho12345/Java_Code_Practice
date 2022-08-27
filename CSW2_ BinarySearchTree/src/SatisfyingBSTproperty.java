import java.util.*;
public class SatisfyingBSTproperty {
	public static boolean isBinaryTreeBST(BSTNode<Integer> tree) {
		return areKeysInRange(tree, Integer.MIN_VALUE, Integer.MAX_VALUE);
	}
	private static boolean areKeysInRange(BSTNode<Integer> tree, Integer lower, Integer upper) {
		if(tree == null) {
			return true;
		}else if(Integer.compare(tree.data, lower) < 0 || Integer.compare(tree.data, upper) > 0) {
			return false;
		}return areKeysInRange(tree.left, lower, tree.data) && areKeysInRange(tree.right, tree.data, upper);
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		BSTNode<Integer>t = new BSTNode<>(3);
	    t.left= new BSTNode<>(2);
	    t.right= new BSTNode<>(5);
	    t.left.left= new BSTNode<>(1);
	    t.left.right= new BSTNode<>(4);
	    System.out.println("Is the given binary tree a BST ?? ");
	    if(isBinaryTreeBST(t)) {
            System.out.println("Yes it is");
	    }else {
            System.out.println("No it's not");
	    }	    
	}

}
