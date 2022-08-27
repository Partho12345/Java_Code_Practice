import java.util.*;
public class DelDuplicates {
	public static int delDuplicates(List<Integer> A) {
		if (A.isEmpty()) {
			return 0;
		}
		int Index= 1;
		for (int i=0; i<A.size(); i++) {
			if (!A.get(Index-1).equals(A.get(i))) {
				A.set(Index++, A.get(i));
			}
		}
		for (int i= Index; i<A.size(); i++) {
			A.set(i,0);
		}
		return Index;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<Integer> A = Arrays.asList(20,13,51,51,70,11,11,11,13);
		System.out.println("Original Sorted ArrayList= "+A);
		delDuplicates(A);
		System.out.println("After deleting duplicates= "+A);
	}

}
