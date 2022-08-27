import java.util.*;
public class NextPutation {

	public static List<Integer> nextPutation(List<Integer> P) {
		int k= P.size()-2;
		while (k>= 0 &&
				P.get(k)>= P.get(k+1)) {
			--k;
		}
		if (k== -1) {
			return Collections.emptyList(); 
		}
		for (int i = P.size()-1; i > k; --i) {
			if (P.get(i)>P.get(k)) {
				Collections.swap(P, k, i);
				break;
			}
		} Collections.reverse(P.subList(k+1, P.size()));
		return P;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<Integer> P = Arrays.asList(3,2,1,0);	// for 3,2,1,0 it should return <>
		System.out.println("Permutation List= "+P);
		nextPutation(P);
		System.out.println("Next permutation= "+P);
	}
}