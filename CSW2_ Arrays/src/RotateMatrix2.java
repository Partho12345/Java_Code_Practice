import java.util.*;
public class RotateMatrix2 {

	public static void rotateMat(int i, List<List<Integer>> mat) {
		i= i%mat.size();
		reverse(0, mat.size(), mat);
		reverse(0, i, mat);
		reverse(i, mat.size(), mat);
	}
	private static void reverse(int begin, int end, List<List<Integer>> mat) {
		for (int i= begin, j= end-1; i<j; i++, j--) {
			Collections.swap(mat, i, j);
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<List<Integer>> mat= Arrays.asList(Arrays.asList(1,2,3,4),Arrays.asList(5,6,7,8),Arrays.asList(9,3,5,2),Arrays.asList(6,8,7,3));
		System.out.println("Original Matrix: ");
		for(int i=0; i<4; i++) {
			System.out.println(mat.get(i));
		}rotateMat(4,mat);
		System.out.println("\nRotated Matrix: ");
		for(int i=0; i<4; i++) {
			System.out.println(mat.get(i));
		}
	}

}
