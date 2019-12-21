package practice;

import java.util.HashMap;

public class FishingContest {
	HashMap <String, double[]> allCatches;
	
	public FishingContest(HashMap<String, double[]> allCatches) {
		this.allCatches = allCatches; 
	}

	public double findBiggestFish(String string) {
		double[] temp = allCatches.get(string);
		double biggestNum = 0;
		for (int i = 0; i < temp.length; i++) {
			if(temp[i]>biggestNum) {
				biggestNum = temp[i];
			}
		}
		return biggestNum;
	}

	public Object findWinner() {
		for(String name: allCatches.keySet()) {
			findBiggestFish(name);
		}
		//compare fishes 
		return null;
	}

}
