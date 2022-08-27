import java.util.*;
public class BuySellOnce {
	
	public static int maxProfit(List<Integer> P) {
        int profit= 0;
        int minP= Integer.MAX_VALUE;
        int maxP= 0;
        for(Integer price : P) {
            minP = Math.min(minP, price);
            maxP = Math.max(maxP, price);
            profit = Math.max(profit, price-minP);
            System.out.print(profit+" ");
        }
        System.out.println("\nMin Price= "+minP);
        System.out.println("Max Price= "+maxP);
        return profit;
    }

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<Integer> P = Arrays.asList(12,11,13,9);
		System.out.println(P);
		System.out.println("Max Profit= "+maxProfit(P));
		
	}

}
