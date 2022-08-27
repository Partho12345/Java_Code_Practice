import java.util.*;
public class SpiralOrder3 {

	public static List<Integer> matSpiral(List<List<Integer>> sqMat) {
		int[][] SHIFT= {{0, 1},{1, 0},{0, -1},{-1, 0}}; 
		int x=0, y=0, dir=0;
		List<Integer> spiralOrder= new ArrayList<>();
		for(int i=0; i<sqMat.size()*sqMat.size(); i++) {
			spiralOrder.add(sqMat.get(x).get(y));
			sqMat.get(x).set(y,0);
			int nextX= x+SHIFT[dir][0], nextY= y+SHIFT[dir][1];
			if (nextX<0 || nextX >= sqMat.size() || nextY<0 || nextY >= sqMat.size() || sqMat.get(nextX).get(nextY)==0) {
				dir= (dir+1)%4;
				nextX= x+SHIFT[dir][0];
				nextY= y+SHIFT[dir][1];
			}x= nextX; y= nextY;
		}return spiralOrder;
	}
	public static void givenMatrix(List<List<Integer>> mat) {
		mat.forEach((row)-> {
			row.forEach((elem)-> {
				System.out.print(elem+" ");
			});System.out.println();
		});
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		List<List<Integer>> mat= Arrays.asList(Arrays.asList(1,2,3,4),Arrays.asList(5,6,7,8),Arrays.asList(9,2,4,6),Arrays.asList(1,0,6,3));
//		System.out.println("Given Matrix: "); givenMatrix(mat);
//		System.out.println("\nSpiral Order= "+matSpiral(mat));
		List<List<Integer>> mat = new ArrayList<List<Integer>>();
		int count = 1; int D=3;
		for (int i=0; i<D; i++) {
			ArrayList A = new ArrayList<>();
			for (int j=0; j<D; j++) {
				A.add(count++);
			}
			mat.add(A);
		}
		System.out.println("Given Matrix: "); givenMatrix(mat);
		System.out.println("Spiral Order= "+matSpiral(mat));

	}
}
