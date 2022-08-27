
public class ComputeLCA {	//	10.3
	private static class Status {
		public int numTarNodes;
		public BinaryTreeNode<Integer> ancestor;
		public Status(int numTarNodes, BinaryTreeNode<Integer> node) {
			this.numTarNodes = numTarNodes;
			this.ancestor = node;
		}
	}
	public static BinaryTreeNode<Integer> LCA(BinaryTreeNode<Integer> tree, BinaryTreeNode<Integer> node0, BinaryTreeNode<Integer> node1) { 
		return LCAHelper(tree, node0, node1).ancestor;
	}
	private static Status LCAHelper(BinaryTreeNode<Integer> tree, BinaryTreeNode<Integer> node0, BinaryTreeNode<Integer> node1) {
		if(tree== null) {
			return new Status(0, null);
		}
		Status lestRes= LCAHelper(tree.left, node0, node1);
		if(lestRes.numTarNodes== 2) {
			return lestRes;
		}
		Status rightRes= LCAHelper(tree.right, node0, node1);
		if(rightRes.numTarNodes== 2) {
			return rightRes;
		}
		int numTarNodes= lestRes.numTarNodes+rightRes.numTarNodes+(tree== node0 ? 1 : 0)+(tree== node1 ? 1 : 0);
		return new Status(numTarNodes, numTarNodes== 2 ? tree : null);
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
		BinaryTreeNode node1= t.left.left;
		BinaryTreeNode node2= t.left.right;
		System.out.println("Node1= "+node1.data+"\nNode2= "+node2.data);
		System.out.println("Their Lowest Common Ancestor is: "+LCA(t, node1, node2).data);
	}

}

//	OUTPUT...
//	Node1= 4
//	Node2= 3
//	Their Lowest Common Ancestor is: 6