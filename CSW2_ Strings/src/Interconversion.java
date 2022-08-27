
public class Interconversion {
	public static String intToStr(int x) {
		boolean isNegative= (x<0);
		StringBuilder s= new StringBuilder();
		while(x!= 0){
			s.append((char)('0'+ Math.abs(x%10)));
			x/= 10;
		}return s.append(isNegative ? "-" : "").reverse().toString();
	}
	public static int strToInt(String s) {
		int res=0;
		for(int i=s.charAt(0) == '-' ? 1 : 0; i < s.length(); i++) {
			int digit= s.charAt(i)-'0';
			res= res*10+digit;
		}return s.charAt(0)== '-' ? -res : res;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int x= 123; String s= "456";
		System.out.println("Int to String: "+intToStr(x)+"\nString to Int: "+strToInt(s));
	}

}
