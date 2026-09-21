package code.yakovenko.leetcode.java.easy;

public final class Base7 {

	public String convertToBase7(int num) {
		final StringBuilder stringBuilder = new StringBuilder();

		final boolean isNegative = num < 0;
		num = Math.abs(num);

		do {
			stringBuilder.append((char) ('0' + num % 7));
			num /= 7;
		} while (num != 0);

		if (isNegative) {
			stringBuilder.append('-');
		}

		return stringBuilder.reverse().toString();
	}
}
