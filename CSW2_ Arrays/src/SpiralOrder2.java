import java.util.*;
public class SpiralOrder2 {

	public static List<Integer> matSpiral(List<List<Integer>> sqMat) {
		List<Integer>spiralOrder= new ArrayList<>();
		for (int offset=0; offset<Math.ceil(0.5*sqMat.size()); offset++) {
			matLayerClockwise(sqMat, offset, spiralOrder);	
		}return spiralOrder;
	}

	private static void matLayerClockwise(List<List<Integer>> sqMat, int offset, List<Integer> spiralOrder) {
		if (offset == sqMat.size() - offset - 1) {
			spiralOrder.add(sqMat.get(offset).get(offset));
			return;
		}
		for (int j=offset; j<sqMat.size()-offset-1; j++) {
			spiralOrder.add(sqMat.get(offset).get(j));
		}
		for (int i=offset; i<sqMat.size()-offset-1; i++) {
			spiralOrder.add(sqMat.get(i).get(sqMat.size()-offset-1));
		}
		for (int j=sqMat.size()-offset-1; j>offset; j--) {
			spiralOrder.add(sqMat.get(sqMat.size()-offset-1).get(j));
		}
		for (int i=sqMat.size()-offset-1; i>offset; i--) {
			spiralOrder.add(sqMat.get(i).get(offset));
		}
	}
	public static void printArray(List<List<Integer>>mat) {
		for(int i=0; i<mat.size(); i++) {
			for(int j=0; j<mat.size(); j++) {
				if(j==0)
					System.out.print(+mat.get(i).get(j)+" ");
				else
					System.out.print(mat.get(i).get(j)+" ");
			}
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<List<Integer>> mat = Arrays.asList(Arrays.asList(1,2,3,4), Arrays.asList(5,6,7,8), Arrays.asList(9,2,4,6), Arrays.asList(1,0,6,3));
		System.out.print("Given Order= "); printArray(mat);
		System.out.println("\nSpiral Order= "+matSpiral(mat));
	}
}
