import java.util.*;
public class MergeSortedFiles {
	private static class ArrayEntry {
		public Integer value;
		public Integer arryID;
		public ArrayEntry(Integer value, Integer arryID) {
			this.value = value;
			this.arryID = arryID;
		}
	}
	public static List<Integer> mergeSortedArrays(List<List<Integer>> sortedArrays){
		List<Iterator<Integer>> iter = new ArrayList <>(sortedArrays.size());
		for(List<Integer> array : sortedArrays) {
			iter.add(array.iterator());
		}
		PriorityQueue<ArrayEntry> minHeap= new PriorityQueue<>(((int)sortedArrays.size()), new Comparator<ArrayEntry>() {
			public int compare(ArrayEntry a1, ArrayEntry a2) {
				return Integer.compare(a1.value, a2.value);
			}
		});
		for(int i=0; i<iter.size(); i++) {
			if(iter.get(i).hasNext()) {
				minHeap.add(new ArrayEntry(iter.get(i).next(), i));
			}
		}
		List<Integer> res = new ArrayList <>();
		while(!minHeap.isEmpty()){
			ArrayEntry headEntry = minHeap.poll();
			res.add(headEntry.value);
			if(iter.get(headEntry.arryID).hasNext()){
				minHeap.add(new ArrayEntry(iter.get(headEntry.arryID).next(), headEntry .arryID));
			}
		}return res;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<List<Integer>>A= Arrays.asList(Arrays.asList(3,5,7), Arrays.asList(0,6),Arrays.asList(0,6,28));
		System.out.println("Before Merging: "+A);
		System.out.println("After Merging : "+mergeSortedArrays(A));
	}

}
 