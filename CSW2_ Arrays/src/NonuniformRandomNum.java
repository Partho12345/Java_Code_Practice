import java.util.*;
public class NonuniformRandomNum {
	public static int nonuniformRandomNumGen(List<Integer> values, List<Double> prob) {
		List<Double> prefixSumOfprob = new ArrayList<>();
		double lastSum=0;
        for (double p : prob) {
            prefixSumOfprob.add(lastSum + p);
            lastSum+=p;
        }
//      return values.get((it<0)?(Math.abs(it) - 1) - 1:it);
		Random r = new Random();
		final double uniform01 = r.nextDouble();
		int it = Collections.binarySearch(prefixSumOfprob, uniform01);
		if (it < 0) {
			final int intervalIdx = Math.abs(it) - 1;
			return values.get(intervalIdx);
		} else {
			return values.get(it);
		}
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<Integer> values=Arrays.asList(3,5,7,11);
        List<Double> probabilities=Arrays.asList(9.0/18,6.0/18,2.0/18,1.0/18);
        System.out.println("Values: "+values);
        System.out.println("Probabilities: "+probabilities);
        System.out.println("Random Value: "+nonuniformRandomNumGen(values, probabilities));

	}

}
