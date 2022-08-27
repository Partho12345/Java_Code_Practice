import java.util.*;
public class Implement_Stack {
	static void StackPush(Stack<Integer> S) {
		for(int i=0; i<6; i++) {
			S.push(i);
		}
	}
	static void StackPop(Stack<Integer> S) {
		for(int i=0; i<3; i++) {
			Integer p= (Integer) S.pop();
			System.out.println("pop-outs: "+p);
		}
	}
	static void StackPeek(Stack<Integer> S) {
		Integer pp= (Integer) S.peek();
		System.out.println("Stack top: " +pp);
	}
	static void StackSearch(Stack<Integer>S, int x) {
		Integer pos= (Integer) S.search(x);
		if(pos!= -1) {
			System.out.println("Searching for {"+x+"} --> Found at pos-"+pos);
		}else {
			System.out.println("Searching for {"+x+"} --> Not Found");
		}
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Stack<Integer>S= new Stack<>();
		StackPush(S);
		System.out.println("Original Stack: "+S);
		StackPop(S);
		System.out.println("Updated Stack : "+S);
		StackPeek(S);
		StackSearch(S,2);
	}

}
