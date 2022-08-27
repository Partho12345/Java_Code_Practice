
public class ReverseAllWord1 {
	public static String rvrse(String s) {
		String[] words = s.split(". ");
        String reverseString = "";
        for (int i = 0; i < words.length; i++) {
            String word = words[i];
            String reverseWord = "";
            for (int j = word.length()-1; j >= 0; j--) {
                reverseWord = reverseWord + word.charAt(j);
            } 
            reverseString = reverseString + reverseWord + " ";
        }
        return reverseString;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s= "HELLO.WORLD";
		System.out.println("Given String: "+s);
		System.out.println("Reversing each word: "+rvrse(s));
	}

}
