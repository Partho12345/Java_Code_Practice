
public class Q3_Palindrome {
	public static boolean isPalindromic(String s){
		for (int i = 0, j = s.length() - 1; i < j; i++, j--) {
			if (s.charAt(i) != s.charAt(j)) {
				return false;
			}
		}return true ;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s= "level";
		String rev= "";
		for(int i= s.length()-1; i>=0; i--) {
			rev+= s.charAt(i);
		}System.out.println("reverse of "+s+" will be: "+rev);
		if(s.equals(rev)) 
			System.out.println(s+" is a Palindrome");
		else
			System.out.println(s+" is not a Palindrome");
	}

}
