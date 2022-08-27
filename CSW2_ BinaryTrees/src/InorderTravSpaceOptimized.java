import java.util.*;
public class InorderTravSpaceOptimized {		//	10.11
	public static List<Integer> inorderTraversal(BinaryTreeNode<Integer> tree) {
		List<Integer> result = new ArrayList<>();
		BinaryTreeNode prev= null, curr = tree;
		while(curr!= null){
			if(curr.left== null){
				result.add((Integer) curr.data);
				curr= curr.right;
			} else{
				prev= curr.left;
				while(prev.right!=null && prev.right!=curr) {
					prev=prev.right;
				}
				if(prev.right==null){
					prev.right= curr;
					curr= curr.left;
				}
				else{
					prev.right= null;
					result.add((Integer) curr.data);
					curr= curr.right;
				}
			}
		} return result;
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
		System.out.println("Inorder Traversal: "+inorderTraversal(t));
	}
}

//	OUTPUT...
//	Given Binary Tree: [3, 2, 5, 1, 7, 4, 6]
//	Inorder Traversal: [1, 2, 7, 3, 4, 5, 6]