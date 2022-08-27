/* 
 * Name:- Aditya Satya
 * RegNo:- 19410121063
 * Class:- CSE-O
 */
import java.util.*;
public class SpiralOrderPair{

	public static void getPairs(int n) {
		ArrayList<String> A= new ArrayList<String>();
		int x= 0, y= 0, p= 1, q= 0;
		for(int i=0; i<n; i+=1){
			A.add("("+x+", "+y+")");
			if(x>0) {
				if(x==y+1) {
					p= 0; q= -1;
				}else if(x==-y) {
					p= -1; q= 0;
				}
			}
			else if(x<0) {
				if(x==y) {
					p= 0; q= 1;
				}else if(x==-y) {
					p=1; q=0;
				}
			}x+=p;
			y+=q;
		}System.out.println(A);
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc= new Scanner(System.in);
		System.out.print("Enter the num of pairs: ");
		int n= sc.nextInt();
		System.out.print("Enumerating "+n+" pairs-> ");
		getPairs(n);
	}
}

// OUTPUT:
//	Enter the num of pairs: 10
//	Enumerating 10 pairs= [(0, 0), (1, 0), (1, -1), (0, -1), (-1, -1), (-1, 0), (-1, 1), (0, 1), (1, 1), (2, 1)] 
 