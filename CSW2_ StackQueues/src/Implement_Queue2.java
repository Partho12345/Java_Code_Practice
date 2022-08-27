import java.util.*;
public class Implement_Queue2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Queue<Integer> Q= new LinkedList<>();
		Q.add(12);
		Q.add(23);
		Q.add(45);
		Q.add(67);
		Q.add(75);
		System.out.println("Original Queue: "+Q);
		System.out.println("Front element : "+Q.peek());
		System.out.println("Size of Queue : "+Q.size());
		int n=2;
		System.out.print("\nAfter removing "+n+" elements- ");
		for(int i=0; i<n; i++) {
			System.out.print(Q.poll()+"\t");
		}
		System.out.println("\n\nUpdated Queue : "+Q);
		System.out.println("Front element : "+Q.peek());
		System.out.println("Size of Queue : "+Q.size());
	}

}
//	OUTPUT...
// 
//	Original Queue: [12, 23, 45, 67, 75]
//	Front element : 12
//	Size of Queue : 5
//
//	After removing 2 elements- 12	23	
//
//	Updated Queue : [45, 67, 75]
//	Front element : 45
//	Size of Queue : 3	