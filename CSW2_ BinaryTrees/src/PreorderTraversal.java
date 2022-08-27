import java.util.*;
public class PreorderTraversal {		//	10.8
	public static List <Integer> preTrav(BinaryTreeNode<Integer> tree) {
		Deque<BinaryTreeNode<Integer>>path= new LinkedList<>();
		path.addFirst(tree);
		List<Integer>res= new ArrayList<>();
		while(!path.isEmpty()) {
			BinaryTreeNode<Integer>curr= path.removeFirst();
			if(curr!=null) {
				res.add(curr.data);
				path.addFirst(curr.right);
				path.addFirst(curr.left);
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
		System.out.println("Given Binary Tree : "+A);
		System.out.println("Preorder Traversal: "+preTrav(t));
	}

}

//	OUTPUT...
//	Given Binary Tree : [3, 2, 5, 1, 7, 4, 6]
//	Preorder Traversal: [3, 2, 1, 7, 5, 4, 6]