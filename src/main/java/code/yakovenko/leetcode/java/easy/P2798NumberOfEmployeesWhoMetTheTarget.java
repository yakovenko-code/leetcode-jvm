package code.yakovenko.leetcode.java.easy;

public final class P2798NumberOfEmployeesWhoMetTheTarget {

	public int numberOfEmployeesWhoMetTarget(int[] hours, int target) {
		int count = 0;

		for (final int hour : hours) {
			if (hour >= target) {
				count++;
			}
		}

		return count;
	}
}
