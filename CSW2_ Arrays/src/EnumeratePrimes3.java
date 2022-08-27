import java.util.*;
public class EnumeratePrimes3 { 
	// 3rd Method
	public static List<Integer> generatePrimes(int n) {
		boolean[] numbers = new boolean[n+1];
		for (int i=2; i<=n; i++) {
			if (!numbers[i]) {
				for (int j=2*i; j<=n; j+=i) {
					numbers[j]= true;
				}
			}
		}
		List<Integer> A= new ArrayList<>();
		for (int i=2; i<= n; i++) {
			if (!numbers[i]) {
				A.add(i);
			}
		}return A;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc= new Scanner(System.in);
		int n= sc.nextInt();
		System.out.println("Primes bfore "+n+" are:"+"\n"+generatePrimes(n));
	}
}
