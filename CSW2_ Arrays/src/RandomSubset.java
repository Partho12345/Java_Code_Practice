import java.util.*;
public class RandomSubset {
	public static List<Integer> randomSubset(int n, int k) {
		Map<Integer,Integer> changedElem= new HashMap<>();
		Random randIdxGen = new Random();
		for(int i=0; i<k; ++i) {
			int randIdx = i + randIdxGen.nextInt(n-i);
			Integer p1 = changedElem.get(randIdx);
			Integer p2 = changedElem.get(i);
			if (p1 == null && p2 == null) {
				changedElem.put(randIdx , i);
				changedElem.put(i, randIdx);
			}else if(p1 == null && p2 != null) {
				changedElem.put(randIdx , p2);
				changedElem.put(i, randIdx);
			}else if(p1!= null && p2 == null) {
				changedElem.put(i,p1);
				changedElem.put(randIdx, i);
			} else {
				changedElem.put(i, p1);
				changedElem.put(randIdx, p2);
			}
		}
		System.out.println("HashTable= "+changedElem);
		List<Integer>result = new ArrayList<>(k);
		for(int i=0; i<k; ++i) {
			result.add(changedElem.get(i));
		}return result;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.out.println("RandomSubset= "+randomSubset(100,4));
	}

}
