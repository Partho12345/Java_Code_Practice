import java.util.*;
public class BuySellTwice {
	public static int maxProfit(List<Integer> P) {
		List<Integer> firstProfits = new ArrayList<>();
		int minPriceSoFar = Integer.MAX_VALUE;
		int maxProfit = 0;
		for (Integer price : P) {
			minPriceSoFar = Math.min(minPriceSoFar, price);
			maxProfit = Math.max(maxProfit, price - minPriceSoFar);
			firstProfits.add(maxProfit);
		}
		int maxPriceSoFar = Integer.MIN_VALUE;
		for (int i = P.size()-1; i>0; i--) {
			maxPriceSoFar = Math.max(maxPriceSoFar, P.get(i));
			maxProfit = Math.max(maxProfit, maxPriceSoFar-P.get(i) + firstProfits.get(i-1));
		}
		System.out.println("Min Price = "+minPriceSoFar);
        System.out.println("Max Price = "+maxPriceSoFar);
		return maxProfit;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<Integer> P = Arrays.asList(12,11,13,9,12,8,14,13,15);
		System.out.println(P);
		System.out.println("Max Profit= "+maxProfit(P));
	}
}
