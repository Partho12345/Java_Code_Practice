
public class InsertionDeletion {			//	15.10 
	public static class Node{  
		int data;  
		Node left;  
		Node right;  
		public Node(int data){   
			this.data = data;  
			this.left = null;  
			this.right = null;  
		}  
	}  
	public Node root;  
	public InsertionDeletion(){  
		root = null;  
	}  
	public void insert(int data) {  
		Node newNode = new Node(data);  
		if(root == null){  
			root = newNode;  
			return;  
		}  
		else {   
			Node current = root, parent = null;  
			while(true) {  
				parent=current;  
				if(data < current.data) {  
					current = current.left;  
					if(current == null)  
						parent.left = newNode;  
					return;  
				}  
				else {  
					current = current.right;  
					if(current == null) {  
						parent.right = newNode;  
						return;  
					}  
				}  
			}  
		}  
	}    
	public Node minNode(Node root) {  
		if(root.left != null)  
			return minNode(root.left);  
		else  
			return root;  
	}    
	public boolean delete(Integer key) {
		Node curr = root, parent = null;
		while(curr != null && Integer.compare((int) curr.data , key) != 0) {
			parent = curr ;
			curr = Integer.compare(key , (int) curr.data) < 0 ? curr.left : curr.right;
		}
		if(curr == null) {
			return false;
		}
		Node keyNode = curr;
		if(keyNode.right != null) {
			Node rKeyNode = keyNode.right ;
			Node rParent = keyNode ;
			while (rKeyNode.left != null) {
				rParent = rKeyNode ;
				rKeyNode = rKeyNode.left ;
			}
			keyNode.data = rKeyNode.data ;
			if(rParent.left == rKeyNode) {
				rParent.left = rKeyNode.right ;
			} else { 
				rParent.right = rKeyNode.right ;
			}
			rKeyNode.right = null;
		} else {
			if(root == keyNode) {
				root = keyNode.left ;
				keyNode.left = null;
			} else {
				if(parent.left == keyNode) {
					parent.left = keyNode.left ;
				} else {
					parent.right = keyNode.left ;
				}
				keyNode.left = null;
			}
		}return true ;
	}
	public void Inorder(Node node) {
		if(node!= null) { 
			Inorder(node.left);  
			System.out.print(node.data+" ");   
			Inorder(node.right);
		}
	}    
	public static void main(String[] args) {  
		// TODO Auto-generated method stub
		InsertionDeletion t = new InsertionDeletion();  
		t.insert(50);  
		t.insert(30);  
		t.insert(70);  
		t.insert(60); 
		t.insert(80);
		t.insert(90);  
		System.out.print("BST after insertion:  "); t.Inorder(t.root);
		t.delete(50);
		t.delete(30);
		System.out.print("\n\nAfter deletion of 30 and 50, \nwe get:  "); t.Inorder(t.root);
	}  

}  