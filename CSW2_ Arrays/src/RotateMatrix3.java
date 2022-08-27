import java.util.*;
public class RotateMatrix3 {
	private List<List<Integer>> wrappedSqMat ;
	public RotateMatrix3(List<List<Integer>> sqMat) {
		this.wrappedSqMat = sqMat;
	}
	public int read(int i, int j) {
		return wrappedSqMat.get(wrappedSqMat.size() - 1 - j).get(i);
	}
	public void write(int i, int j, int v) {
		wrappedSqMat.get(wrappedSqMat.size() - 1 - j).set(i, v);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<List<Integer>> mat= Arrays.asList(Arrays.asList(1,2,3,4),Arrays.asList(5,6,7,8),Arrays.asList(9,3,5,2),Arrays.asList(6,8,7,3));
		System.out.println((mat));
//		System.out.println("Original Matrix: ");
//		for(int i=0; i<4; i++) {
//			System.out.println(mat.get(i));
//		}RotateMatrix3(mat);
//		System.out.println("\nRotated Matrix: ");
//		for(int i=0; i<4; i++) {
//			System.out.println(mat.get(i));
//		}
	}

}
