
public class lookNsay {
	static String lookSay(int n) {
		if(n == 1)     
			return "1";
		if(n == 2)     
			return "11";
		String s= "11";
		for(int i = 3; i <= n; i++) {
			s+='@';
			int count= 1; 
			String temp= "";
			char []ar= s.toCharArray();
			for(int j=1; j<s.length(); j++) {
				if(ar[j] != ar[j-1]) {
					temp+= count;
					temp+= ar[j-1];
					count=1;
				}
				else {
					count++;
				}
			}s= temp;
		} return s;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n=7;
		System.out.println("for n="+n+": \n"+lookSay(n));
	}

}
