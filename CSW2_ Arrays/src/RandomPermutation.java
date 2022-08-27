import java.util.*;
public class RandomPermutation {
	
	public static List<Integer> computeRandPerm(int n) {
		List <Integer> perm= new ArrayList<>(n) ;
		for(int i=0; i<n; i++) {
			perm.add(i);
		}
		OnlineSampling.randomSampling(perm.size(),perm) ;
		return perm;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc= new Scanner(System.in);
		int n= sc.nextInt();
		System.out.println("After sampling=  "+computeRandPerm(n));
	}
}
