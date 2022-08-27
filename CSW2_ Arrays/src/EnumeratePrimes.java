import java.util.*;
public class EnumeratePrimes {

	public static List<Integer> generatePrimes(int n){
		List<Integer> primes = new ArrayList<>();
		List<Boolean> isPrime = new ArrayList<>(Collections.nCopies(n+1, true));
		isPrime.set(0,false);
		isPrime.set(1,false);
		for (int i=2; i<=n; ++i) {
			if(isPrime.get(i)){
				primes.add(i);
				for (int j=i; j<=n; j+=i){
					isPrime.set(j, false);
				}
			}
		} return primes;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc= new Scanner(System.in);
		int n= sc.nextInt();
		System.out.println(generatePrimes(n));
	}

}
