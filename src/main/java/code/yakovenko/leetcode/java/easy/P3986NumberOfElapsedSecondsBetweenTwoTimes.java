package code.yakovenko.leetcode.java.easy;

public final class P3986NumberOfElapsedSecondsBetweenTwoTimes {

	public int secondsBetweenTimes(String startTime, String endTime) {
		return toSeconds(endTime) - toSeconds(startTime);
	}

	private int toSeconds(final String time) {
		return Integer.parseInt(time.substring(0, 2)) * 60 * 60 +
				Integer.parseInt(time.substring(3, 5)) * 60 +
				Integer.parseInt(time.substring(6, 8));
	}
}
