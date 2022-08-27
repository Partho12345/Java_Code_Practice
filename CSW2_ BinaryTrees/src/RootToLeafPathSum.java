
public class RootToLeafPathSum {		//	10.5
	public static int sumRootToLeaf(BinaryTreeNode<Integer>tree) {
		return sumRootToLeafHelper(tree, 0);
	}
	private static int sumRootToLeafHelper(BinaryTreeNode<Integer>tree, int partialPathSum) {
		if(tree == null) {
			return 0;
		}
		partialPathSum= partialPathSum*2+tree.data;
		if(tree.left== null && tree.right==null) {
			return partialPathSum;
		}return sumRootToLeafHelper(tree.left, partialPathSum)+sumRootToLeafHelper(tree.right, partialPathSum);
	}
	public static boolean hasPathSum(BinaryTreeNode<Integer > tree, int targetSum) {
		return hasPathSumHelper(tree , 0, targetSum);
	}
	private static boolean hasPathSumHelper (BinaryTreeNode <Integer> node, int partialPathSum , int targetSum) {
		if(node == null) {
			return false;
		}
		partialPathSum += node.data;
		if(node.left == null && node.right == null) { 
			return partialPathSum == targetSum;
		}return hasPathSumHelper(node.left, partialPathSum, targetSum) || hasPathSumHelper(node.right, partialPathSum, targetSum);
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		BinaryTreeNode<Integer> t= new BinaryTreeNode<Integer>(1);
		t.left= new BinaryTreeNode<Integer>(0);
		t.right= new BinaryTreeNode<Integer>(1);
		t.left.left= new BinaryTreeNode<Integer>(0);
		t.left.right= new BinaryTreeNode<Integer>(1);
		t.left.right.right= new BinaryTreeNode<Integer>(1);
		System.out.println("Path Sum of root to leaf= "+sumRootToLeaf(t));
		int x=17, y=1;
		System.out.println(x+" has a pathsum: "+ hasPathSum(t,x)+"\n"+y+" has a pathsum: "+ hasPathSum(t,y));
	}

}

//	OUTPUT...
//	Path Sum of root to leaf= 18
//	17 has a pathsum: false
//	1 has a pathsum: true