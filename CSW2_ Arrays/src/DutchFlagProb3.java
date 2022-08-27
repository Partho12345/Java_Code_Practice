import java.util.*;
public class DutchFlagProb3 {
	public static enum Color {RED, BLUE, WHITE}
	public static void dutchFlagPartition(int pIndex, List<Color>A) {
		Color pivot = A.get(pIndex);
		int smaller= 0, equal= 0, larger= A.size();
		while (equal < larger) {
			if (A.get(equal).ordinal() < pivot.ordinal()){
				Collections.swap(A , smaller++, equal++);
			} else if(A.get(equal).ordinal() == pivot.ordinal()){
				++equal ;
			} else { 
				Collections.swap(A , equal, --larger);
			}
		}
	}
	public static void main(String[] args) {
		List<Color> a = new ArrayList<Color>();
		a.add(Color.BLUE);
		a.add(Color.RED);
		a.add(Color.WHITE);
		a.add(Color.RED);
		a.add(Color.WHITE);
		a.add(Color.BLUE);
		System.out.println("Before Partition: "+a);
		dutchFlagPartition(5,a);
//		Collections.sort(a);
		System.out.println("After Partition : "+a);
	}
}