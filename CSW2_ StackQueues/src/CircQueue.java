import java.util.*;
public class CircQueue {
	private static int head=0, tail=0, qElems=0;
	private static int SCALE_FACTOR= 1;
	private static Integer[] entries;
	public CircQueue(int cap) {
		entries= new Integer[cap];
	}
	public void enqueue(Integer x) {
		if(qElems==entries.length) {
			Collections.rotate(Arrays.asList(entries), -head);
			head=0; tail= qElems;
			entries= Arrays.copyOf(entries, qElems*SCALE_FACTOR);
		}
		entries[tail]=x;
		tail= (tail+1)%entries.length;
		qElems++;
//		if(tail== 0)
//			resize();
//		entries[--tail] = x;
//		++qElems;
	}

	public Integer dequeue() {
		if(qElems!=0) {
			qElems--;
			Integer tmp= entries[head];
			head= (head+1)%entries.length;
			//			entries[head--] = null;
			//			qElems--;
			return tmp;
		}throw new NoSuchElementException("Dequeue called on an empty queue.");

	}
//	public void resize() {
//		Integer[] tmp= new Integer[entries.length*SCALE_FACTOR];
//		int c= tmp.length-qElems;
//		for(int i=tail; i<=head; i++) {
//			tmp[c++]= entries[i];
//		}
//		entries= tmp;
//		tail= head-tail+1; head= tmp.length-1;
//	}	
	public int size() {
		return qElems;
	}
	public static void display() {
		for(int i=head; i<tail; i++) {
			System.out.print(entries[i]+" ");
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		CircQueue q= new CircQueue(99);
		q.enqueue(4);
		q.enqueue(2);
		q.enqueue(5);
		q.enqueue(7);
		System.out.print("Circular Queue: ");
		q.display();
		System.out.println("\nsize: "+q.size());
		q.dequeue();
		q.dequeue();
		System.out.print("\nUpdated Queue : ");
		q.display();
//		for(int i=0; i<q.size(); i++) {
//			System.out.print(q.dequeue()+" ");
//		}
		System.out.println("\nsize: "+q.size());
	}

}
