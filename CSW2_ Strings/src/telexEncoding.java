import java.util.*;
public class telexEncoding {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc= new Scanner(System.in);
		System.out.print("Actual msg = ");
		String s= sc.nextLine();
		s= s.replace(".", "DOT");
		s= s.replace(",", "COMMA");
		s= s.replace(";", "COLON");
		s= s.replace("?", "QUESTION MARK");
		s= s.replace("!", "EXCLAMATION MARK");
		System.out.print("Encoded msg= "+s);
	}

}
