/* 
 * Aditya Satya
 * 19410121063
 * CSE-0
 * String Builder Methods*/

public class Q4_StringBuilder_hw {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		StringBuilder s= new StringBuilder("Smile ");
		s.toString();
		System.out.println("s.toString(): "+s);
		
		s.replace(5,6,"y");
		System.out.println("s.replace():  "+s);
		
		s.insert(6," face");
		System.out.println("s.insert():   "+s);
		
		s.delete(5,11);
		System.out.println("s.delete():   "+s);
		
		s.append(" Please");
		System.out.println("s.append():   "+s);
		
		char ch= s.charAt(0);
		System.out.println("s.charAt():   "+ch);
		
		s.deleteCharAt(6);
		System.out.println("s.deleteCharAt(): "+s);	
	}
}
