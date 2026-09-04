package code.yakovenko.leetcode.java.medium;

public final class IntegerToRoman {

	private static final int[] INTS = {1000, 900, 500, 400, 100, 90, 50, 40, 10, 9, 5, 4, 1};
	private static final String[] ROMANS = {"M", "CM", "D", "CD", "C", "XC", "L", "XL", "X", "IX", "V", "IV", "I"};

	public String intToRoman(int num) {
		final StringBuilder stringBuilder = new StringBuilder();

		int i = 0;

		while (num != 0) {
			final int count = num / INTS[i];

			stringBuilder.append(ROMANS[i].repeat(count));

			num -= count * INTS[i++];
		}

		return stringBuilder.toString();
	}
}
