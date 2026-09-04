package code.yakovenko.leetcode.java.easy;

public final class RichestCustomerWealth {

	public int maximumWealth(int[][] accounts) {
		int max = 0;

		for (final int[] account : accounts) {
			max = Math.max(max, sum(account));
		}

		return max;
	}

	private int sum(int[] account) {
		int sum = 0;

		for (final int wealth : account) {
			sum += wealth;
		}

		return sum;
	}
}
