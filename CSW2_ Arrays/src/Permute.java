import java.util.*;
public class Permute {
	public static void Permutation(List<Integer> P, List<Integer> A) {
		for(int i=0; i<P.size()-1; i++) {
			for(int j=0; j<P.size()-i-1; j++) {
				if(P.get(j)>P.get(j+1)) {
					Collections.swap(P, j, j+1);
					Collections.swap(A, j, j+1);
				}
			}
		}
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<Integer> P = Arrays.asList(2,0,1,3);
		List<Integer> A = Arrays.asList(3,1,2,0);
		System.out.println("Permutation List= "+P+"\n"+"Original List =   "+A);
		Permutation(P, A);
		System.out.println("Permuted List =   "+A);
	}

}
