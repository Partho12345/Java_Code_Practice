
public class PascalsTriangle {
	public static void getPasTriangle(int n) {
		for(int i=1; i<=n; i++) {
			for(int a=0; a<=n-i; a++) {
				System.out.print(" ");
			}
			int cof=1;
			for(int j=1; j<=i; j++) {
				System.out.print(cof+" ");
				cof= (cof*(i-j))/j;
			}System.out.println();
		}
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n=4;
		System.out.println("Pascal's Triangle with "+n+" rows:-");
		getPasTriangle(n);
	}

}
