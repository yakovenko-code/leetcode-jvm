package code.yakovenko.leetcode.java.easy;

public final class ConvertANumberToHexadecimal {

	private final static char[] DIGITS = {
			'0', '1', '2', '3', '4', '5', '6', '7', '8', '9', 'a', 'b', 'c', 'd', 'e', 'f'
	};

	public String toHex(int num) {
		if (num == 0) return "0";

		final StringBuilder stringBuilder = new StringBuilder();

		while (num != 0) {
			stringBuilder.append(DIGITS[num & 15]);
			num >>>= 4;
		}

		return stringBuilder.reverse().toString();
	}
}
