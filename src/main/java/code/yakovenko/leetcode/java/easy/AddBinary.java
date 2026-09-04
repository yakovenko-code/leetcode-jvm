package code.yakovenko.leetcode.java.easy;

public final class AddBinary {

	public String addBinary(String a, String b) {
		final StringBuilder stringBuilder = new StringBuilder();

		int i = a.length() - 1;
		int j = b.length() - 1;
		int additional = 0;

		while (i >= 0 || j >= 0 || additional == 1) {
			int result = additional;

			if (i >= 0) result += a.charAt(i--) - '0';
			if (j >= 0) result += b.charAt(j--) - '0';

			stringBuilder.append(result & 1);
			additional = result >> 1;
		}

		return stringBuilder.reverse().toString();
	}
}
