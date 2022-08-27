import java.util.*;
public class SortAlmostSortedArray {
	public static void sortKSortedArray(List<Integer> sequence, int k) {
        PriorityQueue<Integer> P = new PriorityQueue<>(sequence.subList(0, k+1));
        int idx= 0;
        for(int i= k+1; i<sequence.size(); i++) {
            sequence.set(idx++, P.poll());
            P.add(sequence.get(i));
        }
        while(!P.isEmpty()) {
            sequence.set(idx++, P.poll());
        }
    }
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<Integer> A = Arrays.asList(3,-1,2,6,4,5,8);
		int k=2;
        sortKSortedArray(A, k);
        System.out.println(A);
	}

}
