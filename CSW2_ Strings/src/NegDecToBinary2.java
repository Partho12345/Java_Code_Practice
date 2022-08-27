import java.util.*;
public class NegDecToBinary2 {	// Ques2

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc= new Scanner(System.in);
		System.out.print("Enter a neg integer: ");
		int n= sc.nextInt();
		System.out.println(n+" into binary: "+Integer.toUnsignedString(n,2));
		// It shows the output in 32-bit binary reprsentation
	}

}

//	OUTPUT...
//	Enter a neg integer: -123
//	-123 into binary: 11111111111111111111111110000101