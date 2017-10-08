package SearchingAndSortingAlgorithms;

import java.util.ArrayList;
import java.util.List;

public class Algorithms {
	public static int findBrokenEgg(List<String> eggs) {
		int j = -1;
		for (String s : eggs) {
			j++;
			if (s.equalsIgnoreCase("cracked")) {
				return j;
			}
		}
		return 0;
	}

	public static int countPearls(List<Boolean> oysters) {
		int j = 0;
		for (boolean hasPearl : oysters) {
			if (hasPearl) {
				j++;
			}
		}
		return j;
	}

	public static double findTallest(List<Double> peoples) {
		double j = 0;
		for (double d : peoples) {
			if (j < d) {
				j = d;
			}
		}
		return j;
	}

	public static String findLongestWord(List<String> words) {
		String j = "";
		for (String i : words) {
			if (j.length() < i.length()) {
				j = i;
			}
		}
		return j;
	}

	public static boolean containaSOS(List<String> z) {
		for (String s : z) {
			if (s.contains("... --- ...")) {
				return true;
			}
		}
		return false;
	}

	public static List<Double> sortScores(List<Double> scores) {
		List<Double> newScores = new ArrayList<Double>();
		for (int i = 0; i < scores.size(); i++) {
			double least = 0;
			for (int j = 0; j < scores.size(); j++) {
				if (scores.get(j) > least && !newScores.contains(scores.get(j))) {
					least = scores.get(j);
				}
			}
			newScores.add(least);
		}
		List<Double> reversedScores = new ArrayList<Double>();
		for (int i = newScores.size() - 1; i > -1; i--) {
			reversedScores.add(newScores.get(i));
		}
		return reversedScores;
	}
	// Add other methods here

	public static List<String> sortDNA(List<String> unsortedSequences) {
		List<String> newScores = new ArrayList<String>();
		for (int i = 0; i < unsortedSequences.size(); i++) {
			String least = "";
			for (int j = 0; j < unsortedSequences.size(); j++) {
				if (unsortedSequences.get(j).length() > least.length()
						&& !newScores.contains(unsortedSequences.get(j))) {
					least = unsortedSequences.get(j);
				}
			}
			newScores.add(least);
		}
		List<String> reversedScores = new ArrayList<String>();
		for (int i = newScores.size() - 1; i > -1; i--) {
			reversedScores.add(newScores.get(i));
		}
		return reversedScores;
	}

	public static List<String> sortWords(List<String> l) {
		for (int i = 0; i < l.size(); i++) {
			for (int j = 0; j < l.size(); j++) {
				if (l.get(i).compareTo(l.get(j)) < 0) {
					String a = l.get(j);
					l.set(j, l.get(i));
					l.set(i, a);
				}
			}
		}
		return l;
	}
}