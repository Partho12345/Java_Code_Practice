import java.util.*;
public class SpiralOrder {
	
	public static void Spiral(int m, int n, int mat[][]) {
		int i, k=0, l=0;
		while(k<m && l<n) {
			for(i=l; i<n; i++) {
				System.out.print(mat[k][i]+" ");
			}k++;
			for(i=k; i<m; i++) {
				System.out.print(mat[i][n-1]+" ");
			}n--;
			if(k<m) {
				for(i=n-1; i>=1; i--) {
					System.out.print(mat[m-1][i]+" ");
				}m--;
			}
			if(l<n) {
				for(i=m-1; i>=k; i--) {
					System.out.print(mat[i][l]+" ");
				}l++;
			}
		}
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int A[][]= {{1,2,3,4},{5,6,7,8},{9,2,4,6},{1,0,6,3}};
		System.out.println("Spiral Order: ");
		Spiral(4,4,A);
	}
}
