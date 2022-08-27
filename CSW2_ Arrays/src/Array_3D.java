import java.util.*;
public class Array_3D {

	public static void main(String args[]) {
		// TODO Auto-generated method stub
		ArrayList<ArrayList<Integer>> x = new ArrayList<ArrayList<Integer>>();
		x.add(new ArrayList<Integer>());
		x.get(0).add(0,3);
		x.add(new ArrayList<Integer>(Arrays.asList(3,4,5)));
		x.get(1).add(0,34);
		x.get(1).add(4,56);
		x.add(2, new ArrayList<Integer>(Arrays.asList(3,84)));
		x.add(new ArrayList<Integer>(Arrays.asList(83,84,85)));
		x.add(new ArrayList<Integer>(Arrays.asList(7,8,9,10)));
		x.forEach((elem)-> {
			elem.forEach((z)-> {
				System.out.print(z+" ");
			});
			System.out.println();
		});
	}
}
