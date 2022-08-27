import java.util.*;
public class RotateMatrix {
	public static void rotateMat(List<List<Integer>> sqMat) {
		final int matSize = sqMat.size()-1;
		for(int i=0; i< (sqMat.size()/2); i++) {
			for(int j=i; j < matSize-i; j++) {
				int temp1= sqMat.get(matSize-j).get(i);
				int temp2= sqMat.get(matSize-i).get(matSize-j);
				int temp3= sqMat.get(j).get(matSize-i);
				int temp4= sqMat.get(i).get(j);
				sqMat.get(i).set(j, temp1);
				sqMat.get(matSize-j).set(i, temp2);
				sqMat.get(matSize-i).set(matSize-j, temp3);
				sqMat.get(j).set(matSize-i, temp4);
			}
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<List<Integer>> mat= Arrays.asList(Arrays.asList(1,2,3,4),Arrays.asList(5,6,7,8),Arrays.asList(9,2,4,6),Arrays.asList(1,0,6,3));
		System.out.println("Original Matrix: ");
		for(int i=0; i<4; i++) {
			System.out.println(mat.get(i));
		}rotateMat(mat);
		System.out.println("\nRotated Matrix: ");
		for(int i=0; i<4; i++) {
			System.out.println(mat.get(i));
		}
	}
}
