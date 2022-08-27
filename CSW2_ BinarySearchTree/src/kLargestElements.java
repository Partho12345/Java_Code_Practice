import java.util.*;
public class kLargestElements {		// 15.3
	public static List<Integer> findKLargestInBST(BSTNode<Integer> tree, int k) {
		List<Integer> kLargestElements = new ArrayList<>();
		findKLargestInBSTHelper(tree, k, kLargestElements);
		return kLargestElements;
	}
	private static void findKLargestInBSTHelper(BSTNode<Integer>tree, int k, List<Integer> kLargestElements) {
		if(tree != null && kLargestElements.size() < k) {
			findKLargestInBSTHelper(tree.right, k, kLargestElements);
			if(kLargestElements.size() < k) {
				kLargestElements.add(tree.data);
				findKLargestInBSTHelper(tree.left, k, kLargestElements);
			}
		}
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		BSTNode<Integer>t = new BSTNode<>(19);
	    t.left= new BSTNode<>(7);
	    t.left.left= new BSTNode<>(1);
	    t.right= new BSTNode<>(43);
	    t.left.left= new BSTNode<>(3);
	    t.left.right= new BSTNode<>(11);
	    t.right.left= new BSTNode<>(23);
//	    t.right.right= new BSTNode<>(6);
	    t.right.left.right= new BSTNode<>(37);
	    t.right.left.right.left= new BSTNode<>(29);
	    int k=3;
	    System.out.print(k+"-largest elements in decreasing order: "+findKLargestInBST(t,k));
	}

}
