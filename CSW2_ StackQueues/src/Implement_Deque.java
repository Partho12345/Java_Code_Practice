import java.util.*;
public class Implement_Deque {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Deque<String> d = new LinkedList<String>();
		d.add("ABC"); d.add("DEF"); d.add("GHI");
		System.out.println("Original LinkedList=\t"+d);
		d.addFirst("HEAD");
		d.addLast("FOOT");
//		d.offer("XYZ");
		System.out.println("Updated  LinkedList=\t"+d);
		d.removeFirst();
		d.removeLast();
		System.out.println("\nRemoving first and last elements, \nwe get: "+d);
	}

}
