package code.yakovenko.leetcode.java.easy;

public final class FindMinimumOperationsToMakeAllElementsDivisibleByThree {

	public int minimumOperations(int[] nums) {
		int count = 0;

		for (final int num : nums) {
			if (num % 3 != 0) {
				count++;
			}
		}

		return count;
	}
}
