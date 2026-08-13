package code.yakovenko.leetcode.easy;

public final class MaximumProductOfTwoElementsInAnArray {

	public int maxProduct(int[] nums) {
		int firstMax = Integer.MIN_VALUE, secondMax = Integer.MIN_VALUE;

		for (int num : nums) {
			if (num > firstMax) {
				secondMax = firstMax;
				firstMax = num;
			} else if (num > secondMax) {
				secondMax = num;
			}
		}

		return (firstMax - 1) * (secondMax - 1);
	}
}
