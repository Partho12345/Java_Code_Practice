import java.util.*;
public class InorderTraversal {		//	10.7
	public static List inorderTrav(BinaryTreeNode<Integer> tree) {
		Deque <BinaryTreeNode<Integer>> s = new LinkedList<>() ;
		BinaryTreeNode<Integer> curr= tree;
		List<Integer> res= new ArrayList<>();
		while(!s.isEmpty() || curr!=null) {
			if(curr != null) {
				s.addFirst(curr);
				curr= curr.left ;
			}else {
				curr= s.removeFirst() ;
				res.add(curr.data);
				curr= curr.right;
			}
		}return res;
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
	    List<Integer>A= Arrays.asList(3,2,5,1,7,4,6);
		System.out.println("Given Binary Tree: "+A);
	    System.out.println("Inorder Traversal: "+inorderTrav(t));
	}

}
//	OUTPUT...
//	Given Binary Tree : [3, 2, 5, 1, 7, 4, 6]
//	Preorder Traversal: [3, 2, 1, 7, 5, 4, 6]