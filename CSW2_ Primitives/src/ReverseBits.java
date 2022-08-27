public class ReverseBits {
    
    static int WORD_SIZE = 2;
    static int mask = 0b11;

    public static long swapBits(long x, int i,int j){
        if (((x>>>i)& 1 )!=((x >>> j)&1)){
            long bitMask= (1L <<i) | (1L<<j);
            x^=bitMask;
        } return x;
    }
    public static long reverseBits(long x) {
        long reverse;
        reverse = (swapBits(x & mask, 0, 1) << (3*WORD_SIZE)) |
        (swapBits((x >> WORD_SIZE) & mask, 0, 1) << (2*WORD_SIZE)) |
        (swapBits((x >> 2*WORD_SIZE) & mask, 0, 1) << WORD_SIZE) |
        swapBits((x >> 3*WORD_SIZE) & mask, 0, 1);
        return reverse;
    }
    public static void main(String[] args) {
    	long x=98;
//        System.out.println("Bit Reversal of "+x+" is "+Long.toBinaryString(reverseBits(x)));
        System.out.println(reverseBits(x));
    }
}
