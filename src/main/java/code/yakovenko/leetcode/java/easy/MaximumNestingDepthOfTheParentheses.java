package code.yakovenko.leetcode.java.easy;

public final class MaximumNestingDepthOfTheParentheses {

	public int maxDepth(String s) {
		int currentDepth = 0, maxDepth = 0;

		for (int i = 0; i < s.length(); i++) {
			final char symbol = s.charAt(i);

			if (symbol == '(') {
				maxDepth = Math.max(maxDepth, ++currentDepth);
			} else if (symbol == ')') {
				--currentDepth;
			}
		}

		return maxDepth;
	}
}
