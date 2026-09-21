package code.yakovenko.leetcode.java.easy;

public final class NumberOfSeniorCitizens {

	private static final int AGE_TENS = 11;
	private static final int AGE_ONES = 12;
	private static final int SENIOR_AGE = 60;

	public int countSeniors(String[] details) {
		int count = 0;

		for (final String detail : details) {
			final int age = (detail.charAt(AGE_TENS) - '0') * 10 + (detail.charAt(AGE_ONES) - '0');

			if (age > SENIOR_AGE) {
				count++;
			}
		}

		return count;
	}
}
