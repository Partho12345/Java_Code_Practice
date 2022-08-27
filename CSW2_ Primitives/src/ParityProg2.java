
public class ParityProg2 {
	
	public static short parity1(long x){
		short result= 0;
		while (x != 0) {
			result ^= (x&1);
			x >>>= 1;
		}
		return result;
	}
	public static short parity2(long x){
		short result= 0;
		while (x != 0) {
			result ^= 1;
			x &= (x-1); 
		}
		return result;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		long x=121;
		System.out.println(parity1(x));
		System.out.println(parity2(x));
	}
}
