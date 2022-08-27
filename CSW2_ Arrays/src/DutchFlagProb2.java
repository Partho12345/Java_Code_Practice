import java.util.*;
public class DutchFlagProb2 {
	
	public static enum Color {RED, BLUE, WHITE}
	public static void dutchFlagPartition(int pIndex, List<Color>A) {
		Color pivot = A.get(pIndex);
		int smaller= 0;
		for (int i=0; i < A.size(); ++i){
			if (A.get(i).ordinal() < pivot.ordinal()){
				Collections.swap(A , smaller++, i);
			}
		}

		int larger = A.size()-1;
		for (int i = A.size()-1; i >=0 && A.get(i).ordinal() >= pivot.ordinal(); --i){
			if (A.get(i).ordinal() > pivot.ordinal()){
				Collections.swap(A , larger--, i);
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
		Collections.sort(a);
		System.out.println("After Partition : "+a);
	}
}