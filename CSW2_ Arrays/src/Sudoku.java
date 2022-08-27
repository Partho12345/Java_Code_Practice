import java.util.*;
import java.util.stream.*;
public class Sudoku {
	public static boolean isValidSudoku(List<List<Integer>>partialAssignment) {
		for(int i = 0; i < partialAssignment.size(); i++) {
			if(hasDuplicate(partialAssignment, i, i+1, 0, partialAssignment.size())) {
				return false;
			}
		}
		for(int j=0; j<partialAssignment.size(); j++) {
			if(hasDuplicate(partialAssignment, 0, partialAssignment.size(), j, j + 1)) {
				return false;
			}
		}
		int regionSize= (int)Math.sqrt(partialAssignment.size());
		for(int I=0; I<regionSize; I++) {
			for(int J=0; J<regionSize; J++) {
				if(hasDuplicate(partialAssignment, regionSize*I, regionSize*(I+1), regionSize*J, regionSize*(J+1))) {
					return false;
				}
			}
		}return true;
	}
	private static boolean hasDuplicate (List <List<Integer>>partialAssignment, int startRow, int endRow, int startCol, int endCol) {
		List <Boolean> isPresent = new ArrayList<>(Collections . nCopies (partialAssignment . size () + 1, false));
		for (int i = startRow; i < endRow; ++i) {
			for (int j = startCol; j < endCol; ++j) {
				if (partialAssignment . get (i) . get (j) != 0 && isPresent . get (partialAssignment . get (i) . get (j )) ) {
					return true ;
				}isPresent .set (partialAssignment .get(i).get(j) , true);
			}
		}return false;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Integer[][] board2 = { 
				{5, 3, 4, 6, 7, 8, 9, 1, 2},
				{6, 7, 2, 1, 9, 5, 3, 4, 8},
				{1, 9, 8, 3, 4, 2, 5, 6, 7},
				{8, 5, 9, 7, 6, 1, 4, 2, 3},
				{4, 2, 6, 8, 5, 3, 7, 9, 1},
				{7, 1, 3, 9, 2, 4, 8, 5, 6},
				{9, 6, 1, 5, 3, 7, 2, 8, 4},
				{2, 8, 7, 4, 1, 9, 6, 3, 5},
				{3, 4, 5, 2, 8, 6, 1, 7, 9}};

		Integer[][] board1 = {
				{5, 3, 0, 0, 7, 0, 0, 0, 0},
				{6, 0, 0, 1, 9, 5, 0, 0, 0},
				{0, 9, 8, 0, 0, 0, 0, 6, 0},
				{8, 0, 0, 0, 6, 0, 0, 0, 3},
				{4, 0, 0, 8, 0, 3, 0, 0, 1},
				{7, 0, 0, 0, 2, 0, 0, 0, 6},
				{0, 6, 0, 0, 0, 0, 2, 8, 0},
				{0, 0, 0, 4, 1, 9, 0, 0, 5},
				{0, 0, 0, 0, 8, 0, 0, 7, 9}};

		List<List<Integer>> list = Arrays.stream(board1).map(Arrays::asList).collect(Collectors.toList());
		System.out.println("Partial sudoku:- ");
		for(List<Integer> x: list){
			System.out.println(x);
		}
		System.out.print("\nIs it a valid Sudoku ?? ");
		if(isValidSudoku(list)) {
			System.out.println("Yess it is");
		}else {
			System.out.println("No its not");
		}
		List<List<Integer>> list1 = Arrays.stream(board2).map(Arrays::asList).collect(Collectors.toList());
		System.out.println("\nComplete sudoku:- ");
		for(List<Integer> x: list1){
			System.out.println(x);
		}
	}
}
