import java.util.*;
public class Mnemonics2 {

	public static ArrayList<String> getMnemonics(String s) {
		ArrayList<String> res= new ArrayList<String>();
		ArrayList<String> res1= new ArrayList<String>();
		res.add("");
		for(int i=0; i<s.length(); i++) {
			String letter= map.get(s.charAt(i));
			if(letter.length()==0)
				//break
				continue;
			for(String x : res) {
				for(int j=0; j<letter.length(); j++)
					res1.add(x+letter.charAt(j));
			}
			res= res1;
			res1= new ArrayList<String>();
		}return res;
	}
	static final Map<Character,String> map = new HashMap<Character, String>(){{
		put('1', "");
		put('2', "ABC");
		put('3', "DEF");
		put('4', "GHI");
		put('5', "JKL");
		put('6', "MNO");
		put('7', "PQRS");
		put('8', "TUV");
		put('9', "WXYZ");
		put('0', "");
	}}; 
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String  s= "234";
		System.out.println("All possible mnemonics for "+s+": \n"+getMnemonics(s));
		System.out.println("Total num of possible combinations: "+getMnemonics(s).size());
	}

}
