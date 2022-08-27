
public class StrPalindrome {
	public static boolean isPalindrome(String s){
		for (int i = 0, j = s.length() - 1; i < j; i++, j--) {
			if (s.charAt(i) != s.charAt(j)) {
				return false;
			}
		}return true ;
	}	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s= "madam";
		if(isPalindrome(s)) {
			System.out.println(s+" is a palindrome");
		}else {
			System.out.println(s+" is not a palindrome");
		}
	}

}
