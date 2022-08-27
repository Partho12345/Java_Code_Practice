import java.util.*;

public class PermuteCyclic {
	public static void Permute(List<Integer>P, List<Integer>A) {
		for (int i=0; i<A.size(); i++) {
			boolean isMin= true;
			int j= P.get(i);
			while (j!=i) {
				if (j<i) {
					isMin= false;
					break ;
				}  j=P.get(j) ;
			}
			if (isMin)
				cyclicPermute(i,P,A);
		}
	}
	private static void cyclicPermute(int start, List<Integer>P, List<Integer>A) {
		int i= start;
		int temp= A.get(start) ;
		do {
			int nextI= P.get(i);
			int nextTemp= A.get(nextI) ;
			A.set(nextI,temp);
			i= nextI;
			temp=nextTemp;
		} while (i!=start) ;
	}
		public static void main(String[] args) {
			// TODO Auto-generated method stub
			List<Integer> P = Arrays.asList(1,0,3,2,4);
			List<Integer> A = Arrays.asList(19,41,12,10,63);
			System.out.println(P+"\n"+A);
			Permute(P, A);
			System.out.println(A);
		}
	}
// Output:
// [1, 0, 3, 2, 4]
// [19, 41, 12, 10, 63]
// [41, 19, 10, 12, 63]