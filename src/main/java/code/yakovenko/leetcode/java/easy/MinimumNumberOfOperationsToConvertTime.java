package code.yakovenko.leetcode.java.easy;

public final class MinimumNumberOfOperationsToConvertTime {

	private static final int[] MINUTES = new int[]{60, 15, 5, 1};

	public int convertTime(String current, String correct) {
		int delta = toMinutes(correct) - toMinutes(current);
		int result = 0;

		int i = 0;

		while (delta != 0) {
			result += delta / MINUTES[i];
			delta %= MINUTES[i++];
		}

		return result;
	}

	private int toMinutes(final String time) {
		return Integer.parseInt(time.substring(0, 2)) * 60 + Integer.parseInt(time.substring(3, 5));
	}
}
