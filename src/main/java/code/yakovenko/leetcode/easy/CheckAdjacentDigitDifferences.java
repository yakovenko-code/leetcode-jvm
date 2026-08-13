package code.yakovenko.leetcode.easy;

public final class CheckAdjacentDigitDifferences {

	public boolean isAdjacentDiffAtMostTwo(String s) {
		for (int i = 1; i < s.length(); i++) {
			if (Math.abs(s.charAt(i - 1) - s.charAt(i)) > 2) {
				return false;
			}
		}

		return true;
	}
}
