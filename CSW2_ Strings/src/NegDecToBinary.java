import java.util.*;
public class NegDecToBinary {	// Ques 2

	public static String toBinary(int x) {
		boolean isNegative= (x<0);
		String s= "";
        for(x=Math.abs(x); x>0; x/=2) {
        	s= (x%2)+ s;
        } return isNegative ? "-" + s : s;
    }
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc= new Scanner(System.in);
		System.out.print("Enter the neg decimal num: ");
		int n= sc.nextInt();
		System.out.println("Converting "+n+" into binary, we get: "+toBinary(n));
	}

}

// OUTPUT...
// Enter the neg decimal num: -8
// Converting -8 into binary, we get: -1000