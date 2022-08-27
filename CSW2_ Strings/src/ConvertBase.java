import java.util.*;
public class ConvertBase {

	public static String convertBase(String s, int source, int destination) {
		return Integer.toString(Integer.parseInt(s, source), destination);
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter the num, source and destination of bases: ");
		String s= sc.nextLine();
		int b1= sc.nextInt();
		int b2= sc.nextInt();
		System.out.println(s+" from Base"+b1+" into Base"+b2+" = "+convertBase(s,b1,b2));	
	}

}
