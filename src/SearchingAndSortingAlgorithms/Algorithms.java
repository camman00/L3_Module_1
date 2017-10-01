package SearchingAndSortingAlgorithms;

import java.util.ArrayList;
import java.util.List;

public class Algorithms {
	public static int findBrokenEgg(List<String> eggs) {
		int j = -1;
		for(String s : eggs) {
			j++;
			if(s.equalsIgnoreCase("cracked")) {
				return j;
			}
		}
		return 0;
	}
	public static int countPearls(List<Boolean> oysters) {
		int j = 0;
		for(boolean hasPearl : oysters) {
			if(hasPearl) {
				j++;
			}
		}
		return j;
	}
	public static double findTallest(List<Double> peoples) {
		double j = 0;
		for(double d : peoples) {
			if(j < d) {
				j = d;
			}
		}
		return j;
	}
	public static String findLongestWord(List<String> words) {
		String j = "";
		for(String i : words) {
			if(j.length() < i.length()) {
				j = i;
			}
		}
		return j;
	}
	public static boolean containaSOS(List<String> z) {
		for(String s : z) {
			if(s.contains("... --- ...")) {
				return true;
			}
		}
		return false;
	}
//	public static List<Double> sortScores(List<Double> scores) {
//		List<Double> newScores = new ArrayList<Double>();
//		for (int i = 0; i < scores.size(); i++) {
//			double score = scores.get(i);
//			double least = 0;
//			for(double score2 : scores) {
//				
//			}
//		}
//	}
	//Add other methods here
}