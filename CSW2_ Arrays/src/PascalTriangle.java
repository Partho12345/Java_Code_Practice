import java.util.*;
public class PascalTriangle {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc= new Scanner(System.in);
		System.out.print("No. of rows = ");
		int n= sc.nextInt();
		for(int i=1; i<=n; i++) {
			for(int a=0; a<=n-i; a++) {
				System.out.print(" ");
			}
			int coef=1;
			for(int j=1; j<=i; j++) {
				System.out.print(coef+" ");
				coef= (coef*(i-j))/j;
			}System.out.println();
		}System.out.println("\nPascal's Triangle");
	}
}
