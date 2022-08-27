
public class Compute {

	private static long add(long a, long b) {		// Addition
		long sum= 0, carryin= 0, k=1, tempA= a, tempB= b;
		while (tempA!=0 || tempB!=0) {
			long ak= a & k, bk= b & k ;
			long carryout = (ak & bk) | (ak & carryin)|(bk & carryin);
			sum |= (ak ^ bk ^ carryin);
			carryin= carryout << 1;
			k <<= 1 ;
			tempA >>>= 1 ;
			tempB >>>= 1 ;
		}
		return sum|carryin;
	}
	public static long multiply(long x, long y){	// Multiplication
		long sum= 0;
		while (x!=0) {
			if ((x & 1)!=0) {
				sum = add(sum , y);
			}
			x >>>= 1;
			y <<= 1;
		}
		return sum;
	}
	public static long divide(long x, long y) {		// Division
		long result= 0;
		int power= 32;
		long yPower= y << power ;
		while (x>=y) {
			while (yPower > x) {
				yPower >>>= 1;
			--power ;
			}
			result+= 1L<<power;
			x-= yPower;
		}
		return result;
	}
	public static double power(double x, int y){	// Exponential
		double res= 1.0;
		if (y<0) {
			y= -y;
			x = 1.0/x ;
		} while (y!= 0) {
			if ((y&1)!= 0) {
				res*= x;
			}
			x*= x;
			y >>>= 1 ;
		}
		return res;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(add(35,67));
		System.out.println(multiply(12,21));
		System.out.println(divide(343,7));
		System.out.println(power(5,4));
	}

}
