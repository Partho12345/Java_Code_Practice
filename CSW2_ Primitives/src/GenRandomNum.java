
public class GenRandomNum {
	
	public static int uniformRandom(int lowerBound, int upperBound){
		int Outcomes = upperBound-lowerBound+1, result;
		do {
			result=0;
			for (int i=0; (1 << i) < Outcomes; ++i) {
				result = (result<< 1)|zeroOneRandom();
			}
		} while (result >= Outcomes);
		return result + lowerBound;
	}

	private static int zeroOneRandom() {
		// TODO Auto-generated method stub
		return (int)(Math.random()*2);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		for(int i=1; i<=4; i++) {
			System.out.println("Random Num"+i+" = "+uniformRandom(12,36));
		}
	}

}
