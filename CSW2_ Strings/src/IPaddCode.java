import java.util.*;
public class IPaddCode {
	public static List<String> getValidIPAdd(String s) {
		ArrayList<String> res = new ArrayList<>();
		for(int i=1; i<4 && i<s.length(); i++){
			String first= s.substring(0, i);
			if(isValid(first)) {
				for(int j=1; j<4 && i+j < s.length(); j++) {
					String second= s.substring(i, i+j);
					if(isValid(second)) {
						for(int k=1; k<4 && i+j+k < s.length(); k++) {
							if(s.length()-(i+j+k)<4 && s.length()-(i+j+k)>0) {
								String third = s.substring(i+j, i+j+k);
								String fourth = s.substring(i+j+k, s.length());
								if(isValid(third) && isValid(fourth)) {
									res.add(first+"."+second+"."+third+"."+fourth);
								}
							}
						}
					}

				}
			}
		} return res;
	}
	private static boolean isValid(String s) {
		if(s.length()==0) {
			return false;
		}
		int n= Integer.valueOf(s);
		if(s.length()==3 && (n<100 || n>255)) {
			return false;
		}
		if(s.length()==2 && n<10) {
			return false;
		}
		return true;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String IP= "19216811";
		System.out.println("All valid IP addresses of "+IP+" are: \n"+getValidIPAdd(IP));
		System.out.println("Total num of valid IP addresses are: "+getValidIPAdd(IP).size());
	}

}
