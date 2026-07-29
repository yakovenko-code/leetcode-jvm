package code.yakovenko.leetcode.easy;

public final class EarliestTimeToFinishOneTask {

	public int earliestTime(int[][] tasks) {
		int minTime = Integer.MAX_VALUE;

		for (final int[] task : tasks) {
			minTime = Math.min(minTime, task[0] + task[1]);
		}

		return minTime;
	}
}
