
public class SwapBits {
	public static long swapBits(long x, int i, int j) {

		if (((x >>> i) & 1) != ((x >>> j) & 1)){
			long bitMask = (1 << i)|(1 << j);
			x ^= bitMask;
		}
		return x;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		long x= 73;
		System.out.println(x);
		int i= 1;
		int j= 6;
		System.out.println(swapBits(x,i,j));
	}
}
