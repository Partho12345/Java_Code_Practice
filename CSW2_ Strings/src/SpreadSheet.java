
public class SpreadSheet {
	public static int getColID(String col) {
		int res= 0;
		for(char c : col.toCharArray()) {
			res= (res*26)+(c-'A'+1);
		} return res;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String col= "ABC";
		System.out.println("Column ID for "+col+" is: "+getColID(col));
	}

}
