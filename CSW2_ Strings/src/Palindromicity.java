
public class Palindromicity {

	public static boolean isPalindrome(String s) {
		int i=0, j= s.length()-1;
		while (i<j) {
			while (!Character.isLetterOrDigit(s.charAt(i)) && i < j) {
				i++;
			}
			while (!Character.isLetterOrDigit(s.charAt(j)) && i < j) {
				j--;
			}
			if (Character.toLowerCase(s.charAt(i++)) != Character.toLowerCase(s.charAt(j--))) {
				return false;
			}
		} return true;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s1= "Able was I, ere I saw Elba!";
		String s2= "I'm cool right?";
		System.out.println(s1);
		System.out.println("Is it palindome: "+isPalindrome(s1));
		System.out.println(s2);
		System.out.println("Is it palindome: "+isPalindrome(s2));
	}
}
