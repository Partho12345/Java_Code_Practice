import java.util.*;
public class homework02 {
	public static short ParityGenerator(long x) {
		short result= 0;
		while (x!=0) {
			result ^= (x & 1);
			x >>>= 1;
		}
		return result;
	}
	public static short parity(long x) {
		final int WORD_SIZE = 16;
		final int BIT_MASK = 0xFFFF;

		short[] precomputedParity = new short[1 << 16];
		for (int i = 0; i < (1 << WORD_SIZE); ++i) {
			precomputedParity[i] = ParityGenerator(i);
		}
		return (short) (precomputedParity[(int) ((x >>> (3 * WORD_SIZE)) & BIT_MASK)]
				^ precomputedParity[(int) ((x >>> (2 * WORD_SIZE)) & BIT_MASK)]
						^ precomputedParity[(int) ((x >>> WORD_SIZE) & BIT_MASK)] 
								^ precomputedParity[(int) (x & BIT_MASK)]);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc= new Scanner(System.in);
		long x= sc.nextLong();
		System.out.println("Parity of "+x+" = "+parity(x));
	}

}
