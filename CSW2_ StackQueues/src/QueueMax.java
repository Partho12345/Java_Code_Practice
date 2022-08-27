import java.util.*;
public class QueueMax {
	LinkedList<Integer> queue= new LinkedList<>();
	LinkedList<Integer> qMax= new LinkedList<>();
	Integer tmp= Integer.MIN_VALUE;
	Integer max= Integer.MIN_VALUE;
	public void enqueue(Integer x) {
		if(x > tmp)
			tmp= x;
		else {
			qMax.addLast(tmp);
			tmp= x;
		}
		if(x > max) {
			max= x;
		}
		queue.addLast(x);
	}
	public Integer dequeue() {
		if(queue.peekFirst().equals(qMax.peekFirst())) {
			Integer possibleMax= qMax.removeFirst();
			if(possibleMax==max) {
				max= qMax.peekFirst();
			}
		} return queue.removeFirst();
	}
	public Integer max() {
		return max;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		QueueMax q= new QueueMax();
		q.enqueue(1);
		q.enqueue(3);
		q.enqueue(5);
		q.enqueue(7);
		System.out.println("Current Queue: "+q.queue);
		System.out.println("Max elem= "+q.max());
		q.dequeue();
		q.enqueue(9);
		System.out.println("Updated Queue: "+q.queue);
		System.out.println("Max elem= "+q.max());
	}

}
