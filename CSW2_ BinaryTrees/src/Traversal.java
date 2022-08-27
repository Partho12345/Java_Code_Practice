
public class Traversal {
	public static void treeTraversal(BinaryTreeNode <Integer> root) {
		if(root!=null) {
			System.out.println("Preorder: "+root.data);
			treeTraversal(root.left);
			System.out.println("Inorder: "+root.data);
			treeTraversal(root.right);
			System.out.println("Postorder: "+root.data);
		}
	}
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

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		BinaryTreeNode<Integer> t= new BinaryTreeNode<Integer>(8);
		t.left= new BinaryTreeNode<Integer>(1);
		t.right= new BinaryTreeNode<Integer>(2);
		t.left.left= new BinaryTreeNode<Integer>(3);
		t.left.right= new BinaryTreeNode<Integer>(4);
		t.right.left= new BinaryTreeNode<Integer>(5);
		t.right.right= new BinaryTreeNode<Integer>(6);
		System.out.print("Preorder: ");Preorder(t);
		System.out.print("\nInorder : ");Inorder(t);
		System.out.print("\nPostorder: ");Postorder(t);
	}

}
