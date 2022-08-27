
public class EvenOdd {

	public static void evenOdd(int[] A){
		int nxtEven= 0, nxtOdd= A.length-1;
		while (nxtEven < nxtOdd) {
			if (A[nxtEven]%2== 0) {
				nxtEven++;
			}else {
				int temp = A[nxtEven];
				A[nxtEven] = A[nxtOdd];
				A[nxtOdd--] = temp;
			}
		}
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int [] ar= new int[]{1,2,3,4,5};
		System.out.println(ar);
		evenOdd(ar);
		System.out.print("Ordered Array: ");
		for(int i=0; i<ar.length; i++) {
			System.out.print(ar[i]+" ");
		}
	}
}
