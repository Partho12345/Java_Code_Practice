import java.util.*;
public class Implement_Queue {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Queue<Integer> Q= new LinkedList<>();
		for(int i=1; i<10; i=i+2) {
			Q.add(i); 
		}System.out.println("Original Queue: "+Q);
		System.out.println("Front element : "+Q.peek()+"\nSize of Queue : "+Q.size()+"\n");
		for(int i=1; i<3; i++) {
			System.out.println("Removing-"+Q.poll());
		}
		System.out.println("\nUpdated Queue : "+Q);
		System.out.println("Front element : "+Q.peek()+"\nSize of Queue : "+Q.size());
	}

}

//	OUTPUT...
//
//	Original Queue: [1, 3, 5, 7, 9]
//	Front element : 1
//	Size of Queue : 5
//
//	Removing-1
//	Removing-3
//
//	Updated Queue : [5, 7, 9]
//	Front element : 5
//	Size of Queue : 3
