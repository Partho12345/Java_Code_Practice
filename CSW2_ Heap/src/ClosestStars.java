import java.util.*;
public class ClosestStars {
	public static class Star implements Comparable<Star> {
		private double x, y, z;
		public Star(double x, double y, double z) {
			this.x = x;
			this.y = y;
			this.z = z;
		}
		public double distance() { 
			return Math.sqrt(x * x + y * y + z * z); 
		}
		public int compareTo(Star rhs) {
			return Double.compare(this.distance(), rhs.distance());
		}
		public String toString() { 
			return "("+x+", "+y+", "+z+")"; 
		}
	}
	public static List<Star> findClosestKStars(int k, Iterator<Star> stars) {
		PriorityQueue<Star> maxHeap= new PriorityQueue<>(k, Collections.reverseOrder());
		while(stars.hasNext()) {
			Star star= stars.next();
			maxHeap.add(star);
			if(maxHeap.size()==k+1) {
				maxHeap.remove();
			}
		}
		List<Star> orderedStars = new ArrayList<Star>(maxHeap);
		Collections.sort(orderedStars);
		return orderedStars;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<Star> stars = new ArrayList<>();
		stars.add(new Star(1,2,3));
		stars.add(new Star(4,5,6));
		stars.add(new Star(1,2,1));
		stars.add(new Star(1,3,6));
		stars.add(new Star(0,2,1));
		stars.add(new Star(1,0,2));
		int k=2;
		System.out.println("Coordinates of "+k+" closest stars:\n"+findClosestKStars(k, stars.iterator()));
	}
	
}
