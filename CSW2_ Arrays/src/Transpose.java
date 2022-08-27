
public class Transpose {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int mat[][]= {{1,2,3},{4,5,6},{7,8,9}};
		int trans[][]= new int[3][3];
		for(int i=0; i<3; i++) {    
			for(int j=0; j<3; j++) {    
				trans[i][j]= mat[j][i];  
			}    
		}  
		System.out.println("Before Transpose:");  
		for(int i=0; i<3; i++){    
			for(int j=0; j<3; j++){    
				System.out.print(mat[i][j]+" ");    
			}System.out.println();        
		}    
		System.out.println("\nAfter Transpose:");  
		for(int i=0; i<3; i++){    
			for(int j=0; j<3; j++){    
				System.out.print(trans[i][j]+" ");    
			}System.out.println();    
		} 
	}

}
