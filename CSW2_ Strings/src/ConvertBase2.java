import java.util.*;
public class ConvertBase2 {		// Ques 1
	public static String baseConversion(String s, int b1, int b2) {
        char[] c = s.toCharArray();
        boolean neg = c[0] == '-';
        int n= 0;
        for (int i = neg ? 1 : 0; i < c.length; i++) {
            n*= b1;
            n+= Character.isDigit(c[i]) ?c[i] - '0' : c[i] - 'A' + 10 ;
        }
        return (neg ? "-" : "") + baseConvert(n, b2);
    }

    private static String baseConvert(int n, int base) {
        return n == 0 ? "" : baseConvert(n/base,base)+(char)(n%base >9 ? 'A'+n%base -10 : n%base+'0');
    }

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter the num with source and destination of bases: ");
		String s= sc.nextLine();
		int source= sc.nextInt();
		int dest= sc.nextInt();
		System.out.println("Converting "+s+" from (base"+source+") into (base"+dest+") we get: "+baseConversion(s,source,dest));
	}

}

// OUTPUT...
// 	 Enter the num with source and destination of bases: 
//	 123
//	 10
//	 2
//	 Converting 123 from (base10) into (base2) we get: 1111011 
