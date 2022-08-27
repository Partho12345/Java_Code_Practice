import java.util.*;
public class ReverseDigits {
	
	public static long reverse(int x){
		long result= 0;
		long xRemaining= Math.abs(x);
		while (xRemaining!=0) {
			result = result*10 + xRemaining%10;
			xRemaining /= 10;
		}
		return x<0 ? -result : result;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc= new Scanner(System.in);
		int x= sc.nextInt();
		System.out.println(reverse(x));
	}

}
