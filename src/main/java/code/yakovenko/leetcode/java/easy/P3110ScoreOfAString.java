package code.yakovenko.leetcode.java.easy;

public final class P3110ScoreOfAString {

	public int scoreOfString(String s) {
		int result = 0;

		for (int i = 0; i < s.length() - 1; i++) {
			result += Math.abs(s.charAt(i) - s.charAt(i + 1));
		}

		return result;
	}
}
