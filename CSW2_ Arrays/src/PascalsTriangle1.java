import java.util.*;
public class PascalsTriangle1 {
	public static List<List<Integer>> genPasTriangle(int n) {
		List<List<Integer>> pascalTriangle = new ArrayList<>();
		for(int i=0; i<n; i++) {
			List<Integer> c = new ArrayList<>();
			for(int j=0; j<= i; j++) {
				c.add((0<j && j<i) ? pascalTriangle.get(i-1).get(j-1)+ pascalTriangle.get(i-1).get(j) : 1);
			} pascalTriangle.add(c);
		} return pascalTriangle;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n=4;
		System.out.println("num of rows= "+n+"\n");
		List<List<Integer>> res= genPasTriangle(n);
		for(List<Integer> A : res) {
			for(int i=0; i < res.size()-A.size(); i++) {
				System.out.print(" ");
			}
			for(int y : A){
				System.out.print(y +" ");
			}System.out.println();
		}System.out.println("\nPascal's Triangle");
	}
}
