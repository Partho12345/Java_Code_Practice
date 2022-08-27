public class DutchFlagProb_IntValue {

	public static void Flag(int arr[]) {
		int n= arr.length;
		int low= 0;
		int high= n-1;
		int mid= 0;
		int temp;
		while(mid<= high) {
			switch(arr[mid]) {
			case 0:
				temp= arr[low]; 
				arr[low]= arr[mid]; 
				arr[mid]= temp;
				low++;
				mid++;
				break;
			case 1:
				mid++;
				break;
			case 2:
				temp= arr[mid]; 
				arr[mid]= arr[high]; 
				arr[high]= temp;
				high--;
				break;
			}
		}
	}
	public static void Display(int arr[]) {
		for(int i=0; i<arr.length; i++) {
			System.out.print(arr[i]+" ");
		}
		System.out.println();
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[]= {1,2,0,2,1};
		Display(arr);
		Flag(arr);
		Display(arr);
	}

}
