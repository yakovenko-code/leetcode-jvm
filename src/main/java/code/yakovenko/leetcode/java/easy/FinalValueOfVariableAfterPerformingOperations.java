package code.yakovenko.leetcode.java.easy;

public final class FinalValueOfVariableAfterPerformingOperations {

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
