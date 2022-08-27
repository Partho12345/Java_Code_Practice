
public class ParityProg3 {
	public static short parity(long x){
		x ^= x >>> 32;
		x ^= x >>> 16;
		x ^= x >>> 8;
		x ^= x >>> 4;
		x ^= x >>> 2;
		x ^= x >>> 1;
		return (short) (x & 0x1);
	}
		
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		long x= 11101010;
		System.out.println(parity(x));
	}
}
