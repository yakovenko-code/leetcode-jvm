package code.yakovenko.leetcode.easy;

public final class CheckIfNumberHasEqualDigitCountAndDigitValue {

	public boolean digitCount(String num) {
		final int[] counter = new int[10];
		final char[] chars = num.toCharArray();

		for (final char character : chars) {
			counter[character - '0']++;
		}

		for (int i = 0; i < chars.length; i++) {
			if (counter[i] != chars[i] - '0') {
				return false;
			}
		}

		return true;
	}
}
