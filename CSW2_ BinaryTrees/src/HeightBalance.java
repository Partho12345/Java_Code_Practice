
public class HeightBalance {		//	10.1
	public static void Preorder(BinaryTreeNode <Integer> root) {
		if(root!= null) {
			System.out.print(root.data+" ");
			Preorder(root.left);
			Preorder(root.right);
		}
	}
	public static void Inorder(BinaryTreeNode <Integer> root) {
		if(root!= null) {
			Inorder(root.left);
			System.out.print(root.data+" ");
			Inorder(root.right);
		}
	}
	public static void Postorder(BinaryTreeNode <Integer> root) {
		if(root!= null) {
			Postorder(root.left);
			Postorder(root.right);
			System.out.print(root.data+" ");
		}
	}
	private static class balHeight {
		boolean bal;
		int height;
		public balHeight(boolean bal, int height) {
			this.bal = bal;
			this.height = height;
		}
	}
	public static boolean isBal(BinaryTreeNode<Integer> tree) {
		return checkbal(tree).bal;
	}
	private static balHeight checkbal(BinaryTreeNode<Integer> tree) {
		if (tree == null) {
			return new balHeight(true , -1); 
		}
		balHeight leftResult = checkbal(tree.left);
		if (!leftResult.bal) {
			return leftResult;
		}
		balHeight rightResult = checkbal(tree.right);
		if (!rightResult.bal) {
			return rightResult; 
		}
		boolean isbal= Math.abs(leftResult.height - rightResult.height) <= 1;
		int height= Math.max(leftResult.height , rightResult.height)+1;
		return new balHeight(isbal , height);
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		BinaryTreeNode<Integer> t= new BinaryTreeNode<Integer>(8);
		t.left= new BinaryTreeNode<Integer>(2);
		t.right= new BinaryTreeNode<Integer>(3);
		t.left.left= new BinaryTreeNode<Integer>(5);
		t.left.right= new BinaryTreeNode<Integer>(4);
		t.right.left= new BinaryTreeNode<Integer>(9);
		t.right.right= new BinaryTreeNode<Integer>(6);
		System.out.print("Preorder : ");Preorder(t);
		System.out.print("\nInorder  : ");Inorder(t);
		System.out.print("\nPostorder: ");Postorder(t);
		if(isBal(t)) {
			System.out.println("\nTree is Balanced");
		}else {
			System.out.println("\nTree is Unbalanced");
		}
	}

}
