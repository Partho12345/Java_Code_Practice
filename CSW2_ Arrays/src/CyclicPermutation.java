/**
 *    Name: Aditya Satya
 *    RegNum: 19410121063
 *    Section: O
 *    CyclicPermutation code
 **/

import java.util.*;
public class CyclicPermutation {
	
	public static void Permute(List<Integer>P, List<Integer>A) {
		for (int i=0; i<A.size(); i++) {
			boolean isMin= true;
			int j= P.get(i);
			while (j!=i) {
				if (j<i) {
					isMin= false;
					break ;
				}  j=P.get(j) ;
			}
			if (isMin)
				cyclicPermute(i,P,A);
		}
	}
	private static void cyclicPermute(int start, List<Integer>P, List<Integer>A) {
		int i= start;
		int temp= A.get(start) ;
		do {
			int nextI= P.get(i);
			int nextTemp= A.get(nextI) ;
			A.set(nextI,temp);
			i= nextI;
			temp=nextTemp;
		} while (i!=start) ;
	}
		public static void main(String[] args) {
			// TODO Auto-generated method stub
			List<Integer> P = Arrays.asList(3, 1, 2, 0);
			List<Integer> A = Arrays.asList(-1, 1, 2, -4);
			System.out.println("Permutation List= "+P+"\n"+"Original List =   "+A);
			Permute(P, A);
			System.out.println("Permuted List =   "+A);
		}
	}

//		OUTPUT (for negative inputs):-
//		Permutation List= [3, 1, 2, 0]
//		Original List =   [-1, 1, 2, -4]
//		Permuted List =   [-4, 1, 2, -1]

