/**
 *    Name: Aditya Satya
 *    RegNum: 19410121063
 *    Section: O
 *    Online Data Sampling
 **/

import java.util.*;
public class SampleOnlineData {

	public static List<Integer> randomSample(Iterator<Integer> seq, int k) {
		List<Integer> runningSample = new ArrayList<>(k);
		for(int i=0; seq.hasNext() && i<k; i++) {
			runningSample.add(seq.next());
			System.out.println("Next Element= "+seq.next()+" : "+"Element's index= "+i);
		}
		int NumSoFar= k;
		Random randIndexGen = new Random();
		while(seq.hasNext()) {
			Integer x = seq.next();
			NumSoFar++;
			System.out.println("Num seen so far= "+NumSoFar);
			System.out.println("Value to be replaced= "+x);
			final int idxToReplace = randIndexGen.nextInt(NumSoFar);
			System.out.println("Index to replace in= "+idxToReplace);
			if(idxToReplace < k) {
				runningSample.set(idxToReplace, x);
			}
		}return runningSample;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc= new Scanner(System.in);
		List<Integer>P = Arrays.asList(3, 7, 5, 1, 4, 9, 2, 6, 8);
		int k= sc.nextInt();
		System.out.println("Num of packets= "+k);
		System.out.println("Packet sequence sent=  "+P);
		System.out.println("Subset of sampled sequence received= "+randomSample(P.iterator(),k));
	}
}

//	OUTPUT for k=4 packets...
//	4
//	Num of packets= 4
//	Packet sequence sent=  [3, 7, 5, 1, 4, 9, 2, 6, 8]
//	Next Element= 7 : Element's index= 0
//	Next Element= 1 : Element's index= 1
//	Next Element= 9 : Element's index= 2
//	Next Element= 6 : Element's index= 3
//	Num seen so far= 5
//	Value to be replaced= 8
//	Index to replace in= 3
//	Subset of sampled sequence received= [3, 5, 4, 8]
