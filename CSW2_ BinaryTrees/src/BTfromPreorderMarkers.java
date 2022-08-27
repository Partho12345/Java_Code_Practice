import java.util.*;
public class BTfromPreorderMarkers {		//	10.13
	private static Integer subtreeIdx;
	public static BinaryTreeNode<Integer> reconstruct(List<Integer>preorder) {
		subtreeIdx= 0;
		return reconstructPreorderSubtree(preorder);
	}
	private static BinaryTreeNode<Integer> reconstructPreorderSubtree(List<Integer>preorder) {
		Integer key= preorder.get(subtreeIdx);
		++subtreeIdx;
		if(key== null) {
			return null;
		}
		BinaryTreeNode<Integer> leftSubtree= reconstructPreorderSubtree(preorder);
		BinaryTreeNode<Integer> rightSubtree= reconstructPreorderSubtree(preorder);
		return new BinaryTreeNode<>(key, leftSubtree, rightSubtree);
	}
	public static void Preorder(BinaryTreeNode tree) {
		if(tree!= null) {
			System.out.print(tree.data+" ");
			Preorder(tree.left);
			Preorder(tree.right);
		}
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<Integer> preorder = Arrays.asList(1, 2, 4, null, null, 5, 7, null, null, null, 3, null, 6, null, 8, 9, null, null, null);
		System.out.println("Preorder: " + preorder);
		BinaryTreeNode<Integer> tree= reconstruct(preorder);
		Preorder(tree);
	}

}
