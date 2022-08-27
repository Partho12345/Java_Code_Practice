
public class Replace_Remove {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s= "Hello World Hello";
		CharSequence target= "World";
		CharSequence replacement= "Earth";
		System.out.println("Replace characters:- "+s.replace('H','B'));
		System.out.println("Replace char sequence:- "+s.replace(target,replacement));
		System.out.println("Replace First:- "+s.replaceFirst("Hello", "Hola"));
		System.out.println("Replace All:- "+s.replaceAll("Hello", "Hola"));
	}

}
