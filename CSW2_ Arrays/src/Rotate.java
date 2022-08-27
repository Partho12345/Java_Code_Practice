
public class Rotate {
	public static void rotate(int[][] mat){
		int row= mat.length;
		for(int i=0; i<row; i++){
			for(int j=i; j<row; j++){
				int temp= mat[i][j];
				mat[i][j]= mat[j][i];
				mat[j][i]= temp;
			}
		}
		for(int i=0; i<row; i++){
			for(int j=0; j<row/2; j++){
				int temp= mat[i][j];
				mat[i][j]= mat[i][row-1-j];
				mat[i][row-1-j]= temp;
			}
		}
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int mat[][]= {{1,2,3},{4,5,6},{7,8,9}};
		System.out.println("Original Array:");  
		for(int i=0; i<3; i++){    
			for(int j=0; j<3; j++){    
				System.out.print(mat[i][j]+" ");    
			}System.out.println();        
		}
		System.out.println("\nRotated Array: ");
		rotate(mat);
		for(int i=0; i<mat.length; i++){
			for(int j=0; j< mat.length; j++){
				System.out.print(mat[i][j]+" ");
			}System.out.println();
		}
	}

}
