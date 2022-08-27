
public class LCAwithParentPionters {		//	10.4
	public static BinaryTreeNode<Integer>LCA(BinaryTreeNode<Integer>node0, BinaryTreeNode<Integer>node1) {
		int depth0= getDepth(node0), depth1= getDepth(node1);
		if(depth1 > depth0) {
			BinaryTreeNode<Integer> tmp= node0;
			node0= node1;
			node1= tmp;
		}
		int depthDiff = Math.abs(depth0-depth1);
		while(depthDiff--> 0) {
			node0= node0.parent;
		}
		while(node0 != node1) {
			node0= node0.parent ;
			node1= node1.parent ;
		}return node0;
	}
	private static int getDepth(BinaryTreeNode<Integer> node) {
		int depth = 0;
		while(node.parent!= null) {
			++depth;
			node= node.parent;
		}return depth;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		BinaryTreeNode<Integer> t= new BinaryTreeNode<Integer>(7);
		t.left= new BinaryTreeNode<Integer>(6);
		t.right= new BinaryTreeNode<Integer>(5);
		t.left.left= new BinaryTreeNode<Integer>(4);
		t.left.right= new BinaryTreeNode<Integer>(3);
		t.right.left= new BinaryTreeNode<Integer>(2);
		t.right.right= new BinaryTreeNode<Integer>(1);
		t.left.parent=t.right.parent=t;
		t.left.left.parent=t.left.right.parent=t.left;
		t.right.left.parent=t.right.right.parent=t.right;
		System.out.println("Node1= "+t.left.parent.data+" \tDepth= "+getDepth(t.left.parent));
		System.out.println("Node2= "+t.right.left.parent.data+"\tDepth= "+getDepth(t.right.left.parent));
		System.out.println("Their LCA will be: "+LCA(t.left.parent,t.right.left.parent).data);
	}

}

//	OUTPUT...
//	Node1= 7 		Depth= 0
//	Node2= 5		Depth= 1
//	Their LCA will be: 7