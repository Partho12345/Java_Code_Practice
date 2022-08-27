
public class Q2_StringMethods {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s1= "Hello";
		String s2= "Java";
		System.out.println("Length of string1 = "+s1.length());
		System.out.println("Length of string2 = "+s2.length());
		System.out.println("Concatenation: "+s1.concat(s2));
		System.out.println("Char at index1 of s2 = "+s2.charAt(1));
		System.out.println("Comparision: "+ s1.compareTo(s2));
		System.out.println("Equality: "+s1.equals(s2));
		char ch[]= {'h','e','l','l','o'};
		String s3= " ";
		System.out.println("Copied Value= "+s3.copyValueOf(ch));
		System.out.println("String1 ends with 'o' : "+s1.endsWith("o"));
		System.out.println("Index of 'v' in string2 = "+s2.indexOf("v"));
		System.out.println("Replacing H with F in string1 : "+s1.replace('H', 'F'));
		System.out.println("Replacing string2 with string1 : "+s1.replaceAll(s1,s2));
		String s4 = "Hello:World";
        for (String a: s4.split(":")) {
            System.out.println("Splitting: "+a);
        }
		System.out.println("Substring of string1 = "+s1.substring(0,2));
		char[] chr= s1.toCharArray();
		System.out.println("Char array index1 of string1 : "+chr[1]);
		System.out.println("Uppercasing string1 : "+s1.toUpperCase());
		String s5= "    hello    ";
		System.out.println("Trimming string5 : "+s5.trim());
	}

}
