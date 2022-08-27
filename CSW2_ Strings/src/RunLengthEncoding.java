
public class RunLengthEncoding {
	public static String decode(String s) {
		StringBuilder res= new StringBuilder();
		int count=0;
		for(char ch : s.toCharArray()) {
			if(Character.isDigit(ch))
				count= ch-'0';
			else{
				while((count--)>0) {
					res.append(ch);
				}
			}
		} return res.toString();
	}
	public static String encode(String s) {
		StringBuilder sb= new StringBuilder();
		int count= 0;
		char curr=' ';
		for(char c : s.toCharArray()) {
			if(c== curr) {
				count++;
			}else if(count > 0) {
				sb.append(count);
				sb.append(curr);
				curr= c;
				count= 1;
			}else {
				curr= c;
				count= 1;
			}
		}
		if(count>0){
			sb.append(count);
			sb.append(curr);
		}return sb.toString();
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s1= "aaaabcccaa";
		System.out.println("Given String: "+s1+"\nENCODED Str : "+encode(s1));
		String s2= "3e4f2e";
		System.out.println("\nGiven String: "+s2+"\nDECODED Str : "+decode(s2));
	}

}
