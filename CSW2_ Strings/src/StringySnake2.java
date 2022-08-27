
public class StringySnake2 {
	static void stringySnake(String s) {
	    int n= s.length(); String s1 = "";
	    for(int i=0; i<n; i++) {
	        if(s.charAt(i)==' ') {
	            s1+=+'_';
	        }else {
	            s1+=Character.toLowerCase(s.charAt(i));
	        }
	    }System.out.print(s1);
	}    

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s="Hello_World";
		System.out.print("Given String: "+s+"\nSnake String: ");
		stringySnake(s);
	}

}
