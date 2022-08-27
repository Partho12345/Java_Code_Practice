
public class ReverseAllWords {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s= "howzto do";
		System.out.println("string: "+s);
		String rev= " ";
		for(int i= s.length()-1; i>=0; i--) {
			rev= rev+ s.charAt(i);
		}System.out.println("rverse:"+rev);
		
//		 String s1 = "xy";String s2 = s1;
//		 s1 = s1 + s2 + "z";
//		 System.out.println(s1);
//		
//		String s1 = "Hey, buddy how are you!";
//		int len = s1.length();
//		System.out.println(len);
		
//		String obj = "I LIKE JAVA"; System.out.println(obj.charAt(3));
	}

}
//back tracking, sudoku code