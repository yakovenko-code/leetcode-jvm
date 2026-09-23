package code.yakovenko.leetcode.java.easy;

public final class P1450NumberOfStudentsDoingHomeworkAtAGivenTime {

	public int busyStudent(int[] startTime, int[] endTime, int queryTime) {
		int count = 0;

		for (int i = 0; i < startTime.length; i++) {
			if (startTime[i] <= queryTime && queryTime <= endTime[i]) {
				count++;
			}
		}

		return count;
	}
}
