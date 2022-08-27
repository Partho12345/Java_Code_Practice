
public class BinaryTreeLocking {
	public static class BinaryTree {
		private BinaryTree left, right, parent;
		private boolean locked = false;
		private int numLockedDesc = 0;
		private String data;
		public boolean isLocked() { 
			return locked; 
		}
		public boolean lock() {
			if(numLockedDesc>0 || locked) {
				return false;
			}
			for(BinaryTree iter= parent; iter!=null; iter= iter.parent) {
				if(iter.locked) {
					return false;
				}
			}
			locked= true;
			for(BinaryTree iter= parent; iter!=null; iter=iter.parent) {
				++iter.numLockedDesc;
			}return true;
		}
		public void unlock() {
			if(locked) {
				locked = false;
				for (BinaryTree iter = parent; iter != null; iter = iter.parent) {
					--iter.numLockedDesc;
				}
			}
		}


		public static void main(String[] args) {
			// TODO Auto-generated method stub

		}

	}
}
