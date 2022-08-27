import java.util.*;
public class SampleOfflineData {
	
	public static void randomSample(int k, List<Integer>A){
		Random r = new Random();
		for(int i=0; i<k; i++){
			int index = r.nextInt(A.size()-i);
			Collections.swap(A,i,index);
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc= new Scanner(System.in);
		List<Integer>A = Arrays.asList(3,7,5,11);
		int k= sc.nextInt();
		System.out.println("size= "+k);
		System.out.println("Before sampling= "+A);
		randomSample(k,A); 
		System.out.println("After sampling=  "+A);
	}

}
