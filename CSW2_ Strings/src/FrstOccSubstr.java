
public class FrstOccSubstr {
	public static int getFrstOcc(String t, String s) {
        int length= s.length()-1;
        for(int i= length; i<t.length(); i++) {
            if(t.charAt(i)== s.charAt(length)) {
                if(s.equals(t.substring(i-length,i+1))) {
                    return i-length;
                }
            }
        } return -1;
    }
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String t= "GACGCCA";
		String s= "CGC";
		System.out.println("Given Str: "+t+"\nSubstring: "+s);
		if(getFrstOcc(t,s)==-1) {
			System.out.println("Match Not Found");
		}else {
			System.out.println("Match Found at index-"+getFrstOcc(t,s));
			System.out.println("Time Complexity= O("+(s.length()+t.length())+")");
		}
	}

}
