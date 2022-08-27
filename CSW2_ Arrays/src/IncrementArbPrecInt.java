import java.util.*;
public class IncrementArbPrecInt {

	public static List<Integer> plusOne (List<Integer> A) {
		int n= A.size()-1;
		A.set(n, A.get(n)+1);
		for(int i=n; i>0 && A.get(i)==10; i--) {
			A.set (i,0) ;
			A.set(i-1, A.get(i-1)+1);
		}
		if(A.get(0)==10) {
			A.set(0,0);
			A.add(0,1);
		}
		return A;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<Integer> A= new ArrayList<Integer>();
		A.addAll(Arrays.asList(9,9,9));
		System.out.println("Given ArrayList= "+A);
		System.out.println("After plusOne= "+plusOne(A));
	}
}