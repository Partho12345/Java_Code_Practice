/**
 *    Aditya Satya
 *    19410121063
 *    CSE O
 *    Spiral Ordering in 2D array
 **/
import java.util.*;
public class SpiralOrder4 {
	public static void Spiral(int m, int n, List<List> mat) {
		int i, k=0, l=0;
		int lastrow=(m-1), lastcol= (n-1);
		while(k<= lastrow && l<= lastcol) {
			for(i=l; i<=lastcol; i++)
				System.out.print(mat.get(k).get(i)+" ");
			k++;
			for(i=k; i <= lastrow; i++)
				System.out.print(mat.get(i).get(lastcol)+" ");
			lastcol--;
			if(k <=lastrow) {
				for(i = lastcol; i >= l; i--)
					System.out.print(mat.get(lastrow).get(i) + " ");
				lastrow--;
			}
			if(l <= lastcol) {
				for(i = lastrow; i >= k; i--)
					System.out.print(mat.get(i).get(l) + " ");
				l++;
			}
		}
	}
	public static void givenArray(List<List> mat) {
		mat.forEach((row)-> {
			row.forEach((elem)-> {
				System.out.print(elem+" ");
			});
			System.out.println();
		});
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<List> mat = Arrays.asList(Arrays.asList(1,2,3,4), Arrays.asList(5,6,7,8), Arrays.asList(9,2,4,6), Arrays.asList(1,0,6,3));
		givenArray(mat);
		System.out.println("Spiral Ordering: ");
		Spiral(4,4,mat);
		System.out.println("\n\nFor Characters: ");
		List<List> mat1 = Arrays.asList(Arrays.asList('A','B','C','D'), Arrays.asList('E','F','G','H'), Arrays.asList('I','J','K','L'), Arrays.asList('M','N','O','P'));
		givenArray(mat1);
		System.out.println("Spiral Ordering: ");
		Spiral(4,4,mat1);
	}
}

//	OUTPUT
//	1 2 3 4 
//	5 6 7 8 
//	9 2 4 6 
//	1 0 6 3 
//	Spiral Ordering: 
//	1 2 3 4 8 6 3 6 0 1 9 5 6 7 4 2 
//
//	For Characters: 
//	A B C D 
//	E F G H 
//	I J K L 
//	M N O P 
//	Spiral Ordering: 
//	A B C D H L P O N M I E F G K J 