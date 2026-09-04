package code.yakovenko.leetcode.java.easy;

public final class MaximumNumberOfBalloons {

	public int maxNumberOfBalloons(String text) {
		final int[] count = new int[26];

		for (final char character : text.toCharArray()) {
			count[character - 'a']++;
		}

		int countB = count['b' - 'a'];
		int countA = count[0];
		int countL = count['l' - 'a'] / 2;
		int countO = count['o' - 'a'] / 2;
		int countN = count['n' - 'a'];

		return Math.min(countB, Math.min(countA, Math.min(countL, Math.min(countO, countN))));
	}
}
