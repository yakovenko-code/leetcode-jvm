package code.yakovenko.leetcode.java.easy;

public final class P2011FinalValueOfVariableAfterPerformingOperations {

	public int finalValueAfterOperations(String[] operations) {
		int x = 0;

		for (final String operation : operations) {
			if (operation.charAt(1) == '+') {
				x++;
			} else {
				x--;
			}
		}

		return x;
	}
}
