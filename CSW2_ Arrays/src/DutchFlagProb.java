import java.util.*;
public class DutchFlagProb {
	public static enum Color {RED, WHITE, BLUE}
	public static void dutchFlagPartition(int pIndex, List<Color>A) {
		Color pivot = A.get(pIndex);
		for (int i=0; i<A.size(); ++i) {
			for (int j=i+1; j<A.size(); ++j) {
				if (A.get(j).ordinal() < pivot.ordinal()) {
					Collections.swap(A, i, j);
					break;
				}
			}
		}
		for (int i=A.size()-1; i>=0 && A.get(i).ordinal()>=pivot.ordinal(); --i) {
			for (int j= i-1; j>=0 && A.get(j).ordinal()>=pivot.ordinal(); --j) {
				if (A.get(j).ordinal()>pivot.ordinal()) {
					Collections.swap(A,i,j);
					break;
				}
			}
		}
	}
	public static void main(String[] args) {
		List<Color> a = new ArrayList<Color>();
		a.add(Color.BLUE);
		a.add(Color.RED);
		a.add(Color.WHITE);
		a.add(Color.BLUE);
		a.add(Color.WHITE);
		a.add(Color.BLUE);
		System.out.println("Before Partition: "+a);
		dutchFlagPartition(5,a);
		Collections.sort(a);
		System.out.println("After Partition: "+a);
	}
}