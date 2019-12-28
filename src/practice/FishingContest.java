package practice;

import java.util.ArrayList;
import java.util.HashMap;

public class FishingContest {
	HashMap<String, double[]> allCatches;

	public FishingContest(HashMap<String, double[]> allCatches) {
		this.allCatches = allCatches;
	}

	public double findBiggestFish(String string) {
		double[] allFishes = allCatches.get(string);
		double biggestNum = 0;
		for (int i = 0; i < allFishes.length; i++) {
			if (allFishes[i] > biggestNum) {
				biggestNum = allFishes[i];
			}
		}
		return biggestNum;
	}

	public Object findWinner() {
		double overallBiggest = 0;
		String overallWinner = "";
		for (String name : allCatches.keySet()) {
			double bigFish = 0;
			double[] personsFishes = allCatches.get(name);
			for (int i = 0; i < personsFishes.length; i++) {
				if (personsFishes[i] > bigFish) {
					bigFish = personsFishes[i];
				}
			}
			if (bigFish > overallBiggest) {
				overallBiggest = bigFish;
				overallWinner = name;
			}
		}
		return overallWinner;
	}
}
