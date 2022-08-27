
public class ReverseAllWords1 {
	public static String revInWord(String s){  
	    String []ar= s.split(" .");  
	    String rev= " ";  
	    for(String w: ar){  
	        StringBuilder sb= new StringBuilder(w);  
	        rev+= sb.reverse().toString()+"";  
	    } return rev.trim();  
	}  
	public static String revAllWords(String s) {
		StringBuilder sb= new StringBuilder();
		String []ar= s.split(" \\. ");
		int i= ar.length;
		while((i--)> 0) {
			sb.append(ar[i]+" ");
		} return sb.toString().trim();
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s= "Alice.likes.Bob";
		System.out.println("string : "+s);
		System.out.println("revrse1: "+revInWord(s));
		System.out.println("revrse2: "+revAllWords(s));
	}

}
