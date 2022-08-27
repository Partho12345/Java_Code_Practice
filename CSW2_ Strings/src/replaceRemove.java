
public class replaceRemove {
	public static String replaceAndRemove(int k, char[] s) {
		int writeIndex=0, a=0;
		for(int i=0; i<k; i++) {
			if(s[i] != 'b') {
				s[writeIndex++]= s[i];
			}
			if(s[i]== 'a') {
				a++;
			}
		}
		int currIndex= writeIndex-1;
		writeIndex= writeIndex + a-1;
		while(currIndex>=0) {
			if(s[currIndex]=='a') {
				s[writeIndex--]='d';
				s[writeIndex--]='d';
			} else {
				s[writeIndex--]= s[currIndex];
			}currIndex--;
		}return String.copyValueOf(s);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		char ch[]= {'a','c','d','b','b','c','a'};
		System.out.print("Given array = ");
		for(char s : ch) {
			System.out.print(s);
		}
		int k=7;
		System.out.println("\nResult array= "+replaceAndRemove(k, ch));
	}

} 
