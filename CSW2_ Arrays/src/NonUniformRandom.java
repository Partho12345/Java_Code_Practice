import java.util.*;
public class NonUniformRandom {

	public static int nonuniformRandNumGen(List<Integer> num, List<Double> prob) {
		List<Double> SumOfProb= new ArrayList<>();
//		double lastSum=0;
		SumOfProb.add(0.0);
//		System.out.println("a"+SumOfProb);
		int sum= (SumOfProb.size()-1);
		for (double p : prob) {
			SumOfProb.add(SumOfProb.get(sum) + p);
//			sum+=p;
		}
		Random r = new Random();
		double uniform1 = r.nextDouble();
		System.out.println("Random Values= "+uniform1);
		int it = Collections.binarySearch(SumOfProb, uniform1);
		System.out.println("Search Interval= "+it);
		if (it<0) {
			int intervalIdx= (Math.abs(it)-1)-1;
			return num.get(intervalIdx);
		} else {
			return num.get(it);
		}
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<Integer> num= Arrays.asList(1,3,6,8);
		List<Double> prob= Arrays.asList(8.0/18,7.0/18,3.0/18,1.0/18);
		System.out.println("Numbers= "+num+"\n"+"Interval= "+prob);
		System.out.println("Randomly Generated Number= "+nonuniformRandNumGen(num, prob));
	}
}
