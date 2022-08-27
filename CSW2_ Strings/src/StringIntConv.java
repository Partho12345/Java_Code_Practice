
public class StringIntConv {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s= "121";
		int convert1= Integer.parseInt(s);		//method1
		int convert2= Integer.valueOf(s);		//method2
		System.out.println("str to int: "+convert1+"\t"+convert2);	
		int n= 121;
		String s1= Integer.toString(n);			//method1
		String s2= String.valueOf(n);			//method2
		System.out.println("\nint to str: "+s1+"\t"+s2);
	}
}
