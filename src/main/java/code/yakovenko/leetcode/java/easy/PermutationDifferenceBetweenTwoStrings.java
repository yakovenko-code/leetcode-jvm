package code.yakovenko.leetcode.java.easy;

public final class PermutationDifferenceBetweenTwoStrings {

	public int findPermutationDifference(String s, String t) {
		final int[] indices = new int[26];
		int sum = 0;

		for (int i = 0; i < t.length(); i++) {
			indices[t.charAt(i) - 'a'] = i;
		}

		for (int i = 0; i < s.length(); i++) {
			sum += Math.abs(i - indices[s.charAt(i) - 'a']);
		}

		return sum;
	}
}
