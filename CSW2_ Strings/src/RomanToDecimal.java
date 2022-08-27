import java.util.*;
public class RomanToDecimal {
	public static int romTodec(String s) {
		Map<Character, Integer> m = Map.of('I', 1, 'V', 5, 'X', 10, 'L', 50, 'C', 100, 'D', 500, 'M', 1000);
		int sum = m.get(s.charAt(s.length()-1));
		for(int i=s.length()-2; i>=0; i--) {
			char ch= s.charAt(i);
			if(m.get(s.charAt(i)) < m.get(s.charAt(i+1))) 
				sum-= m.get(s.charAt(i));
			else
				sum+= m.get(s.charAt(i));
		}return sum;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s= "IC";
		int res= romTodec(s);
		System.out.println("Roman Num "+s+" is: "+res);
	}

}
