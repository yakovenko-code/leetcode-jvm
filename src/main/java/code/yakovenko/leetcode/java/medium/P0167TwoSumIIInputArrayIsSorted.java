package code.yakovenko.leetcode.java.medium;

public final class P0167TwoSumIIInputArrayIsSorted {

	public int[] twoSum(int[] numbers, int target) {
		int left = 0, right = numbers.length - 1;

		while (left < right) {
			final int sum = numbers[left] + numbers[right];

			if (target < sum) {
				right--;
			} else if (sum < target) {
				left++;
			} else {
				return new int[]{left + 1, right + 1};
			}
		}

		return new int[0];
	}
}
