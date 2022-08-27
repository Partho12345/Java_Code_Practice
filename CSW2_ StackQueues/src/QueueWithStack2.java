import java.util.*;
public class QueueWithStack2 {
	private Stack<Integer> actual= new Stack<Integer>();
	private Stack s1 = new Stack<>();
	private Stack s2 = new Stack<>();
	public void enqueue(int x) { 
		s1.push(x); 
		System.out.println("Push: "+x);
		actual.push(x);
	}
	public void dequeue() {
		if(s2.isEmpty()){
			while(!s1.isEmpty()){
				s2.push(s1.pop());
			}
		}System.out.println("Pop : "+s2.pop());
		if(!s2.isEmpty()){
			s2.pop();
			actual.pop();
		}
//		throw new NoSuchElementException("Can't pop empty queue");
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		QueueWithStack2 a= new QueueWithStack2();
		a.enqueue(15);
		a.enqueue(25);
		a.enqueue(35);
		System.out.println("Original Queue: "+a.actual);
		a.dequeue();
		a.enqueue(21);
		System.out.println("Updated Queue : "+a.actual);
		
	}

}
