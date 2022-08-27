import java.util.*;
public class Mnemonics {
	public static List<String> phoneMnemonic(String pNum) {
		List<String> mnemonics= new ArrayList<>();
		phoneMnemonicHelper(pNum, 0, new char[pNum.length()], mnemonics);
		return mnemonics; 
	}
	private static final String[] MAPPING = {"0","1","ABC","DEF","GHI","JKL","MNO","PQRS","TUV","WXYZ"};
	private static void phoneMnemonicHelper(String pNum, int digit, char[] parMnemonic, List<String> mnemonics) {
		if(digit==pNum.length()) {
			mnemonics.add(new String(parMnemonic));
		} else{
			for(int i=0; i < MAPPING[pNum.charAt(digit)-'0'].length(); i++) {
				char c= MAPPING[pNum.charAt(digit)-'0'].charAt(i);
				parMnemonic[digit]= c;
				phoneMnemonicHelper(pNum, digit+1, parMnemonic, mnemonics);
			}
		}
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String  s= "234";
		System.out.println("All possible mnemonics for "+s+": \n"+phoneMnemonic(s));
		System.out.println("Total num of possible combinations: "+phoneMnemonic(s).size());
	}

}
