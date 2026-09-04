package code.yakovenko.leetcode.java.easy;

public final class DayOfTheYear {

	private static final int[] DAYS_BEFORE_MONTH = {
			0, 31, 59, 90, 120, 151, 181, 212, 243, 273, 304, 334
	};

	public int dayOfYear(String date) {
		final int year = Integer.parseInt(date.substring(0, 4));
		final int month = Integer.parseInt(date.substring(5, 7));
		final int day = Integer.parseInt(date.substring(8, 10));

		int result = DAYS_BEFORE_MONTH[month - 1] + day;

		if (isLeapYear(year) && month > 2) {
			result++;
		}

		return result;
	}

	private boolean isLeapYear(final int year) {
		return year % 400 == 0 || year % 4 == 0 && year % 100 != 0;
	}
}
