import java.util.*;
public class StackMax {
	private Stack<Integer> actual= new Stack<Integer>();
	private Stack<Integer> maxTrack= new Stack<Integer>();
	public void push(int x) {
		int max= x;
		if(!maxTrack.isEmpty() && max < maxTrack.peek()) {
			max= maxTrack.peek();
		}
		actual.push(x);
		maxTrack.push(max);
	}
	public void pop() {
		actual.pop();
		maxTrack.pop();
	}
	public int getMax() {
		return maxTrack.peek();
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		StackMax s= new StackMax();
		s.push(15);
		s.push(25);
		s.push(35);
		s.push(45);
		System.out.println("Current Stack: "+s.actual);
		System.out.println("Max elem= "+s.getMax());
		s.pop();
		s.push(33);
		System.out.println("Updated Stack: "+s.actual);
		System.out.println("Max elem= "+s.getMax());	
	}

}

//	OUTPUT...
//	Current Stack: [15, 25, 35, 45]
//	Max elem= 45
//	Updated Stack: [15, 25, 35, 33]
//	Max elem= 35