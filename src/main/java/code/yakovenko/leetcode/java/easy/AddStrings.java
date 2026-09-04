package code.yakovenko.leetcode.java.easy;

public final class AddStrings {

	public String addStrings(String num1, String num2) {
		final StringBuilder stringBuilder = new StringBuilder();

		int i = num1.length() - 1;
		int j = num2.length() - 1;
		int additional = 0;

		while (i >= 0 || j >= 0 || additional == 1) {
			int sum = additional;

			if (i >= 0) sum += num1.charAt(i--) - '0';
			if (j >= 0) sum += num2.charAt(j--) - '0';

			stringBuilder.append(sum % 10);
			additional = sum / 10;
		}

		return stringBuilder.reverse().toString();
	}
}
