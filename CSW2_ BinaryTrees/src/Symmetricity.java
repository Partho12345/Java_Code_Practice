
public class Symmetricity {		//	10.2
	public static boolean isSymmetric(BinaryTreeNode<Integer> tree) {
		return tree==null || checkSymmetric(tree.left, tree.right);
	}
	private static boolean checkSymmetric(BinaryTreeNode<Integer>subT0, BinaryTreeNode<Integer>subT1) {
		if(subT0 == null && subT1 == null) {
			return true ;
		}else if(subT0!=null && subT1!=null) {
			return subT0.data== subT1.data && checkSymmetric(subT0.left, subT1.right) && checkSymmetric(subT0.right, subT1.left);
		}return false;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		BinaryTreeNode<Integer> t= new BinaryTreeNode<Integer>(7);
		t.left= new BinaryTreeNode<Integer>(3);
		t.right= new BinaryTreeNode<Integer>(1);
		t.right.left= new BinaryTreeNode<Integer>(5);
		t.left.right= new BinaryTreeNode<Integer>(4);
		System.out.print("1st Binary Tree: ");
		if(isSymmetric(t)) {
			System.out.println("Symmetric");
		}else {
			System.out.println("Non-Symmetric");
		}
		BinaryTreeNode<Integer> a= new BinaryTreeNode<Integer>(1);
		a.left= new BinaryTreeNode<Integer>(2);
		a.right= new BinaryTreeNode<Integer>(2);
		a.left.right= new BinaryTreeNode<Integer>(3);
		a.right.left= new BinaryTreeNode<Integer>(3);
		System.out.print("2nd Binary Tree: ");
		if(isSymmetric(a)) {
			System.out.println("Symmetric");
		}else {
			System.out.println("Non-Symmetric");
		}
	}

}

//	OUTPUT...
//	1st Binary Tree: Non-Symmetric
//	2nd Binary Tree: Symmetric