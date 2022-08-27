import java.util.*;
public class AdvancingThrArr {

	public static boolean canReachEnd(List<Integer> maxAdvanceSteps) {
		int furthestReachSoFar = 0, lastIndex = maxAdvanceSteps.size()-1;
		for (int i=0; i<=furthestReachSoFar && furthestReachSoFar< lastIndex; ++i) {
			furthestReachSoFar= Math.max(furthestReachSoFar, i+maxAdvanceSteps.get(i));
		} return furthestReachSoFar>= lastIndex;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Integer[] ar1= {1,2,0,3,2,1,1};
		List<Integer>A= Arrays.asList(ar1);
		Integer[] ar2= {0,2,0,3,2,1,1};
		List<Integer>B= Arrays.asList(ar2);
		System.out.println("Can Player-1 win: "+canReachEnd(A));
		System.out.println("Can Player-2 win: "+canReachEnd(B));
	}
}
