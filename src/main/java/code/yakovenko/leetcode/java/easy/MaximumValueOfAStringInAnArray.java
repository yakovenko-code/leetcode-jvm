package code.yakovenko.leetcode.java.easy;

public final class MaximumValueOfAStringInAnArray {

	public int maximumValue(String[] strs) {
		int max = 0;

		for (String str : strs) {
			boolean isNumeric = true;

			for (int i = 0; i < str.length(); i++) {
				if (!Character.isDigit(str.charAt(i))) {
					isNumeric = false;
					break;
				}
			}

			max = Math.max(max, isNumeric ? Integer.parseInt(str) : str.length());
		}

		return max;
	}
}
