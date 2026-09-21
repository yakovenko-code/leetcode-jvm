package code.yakovenko.leetcode.java.easy;

public final class MinimumNumberGame {

	public int[] numberGame(int[] nums) {
		final int[] arr = new int[nums.length];

		for (int i = 0; i < nums.length / 2; i++) {
			int aliceIndex = nums[0] < nums[1] ? 0 : 1;
			int bobIndex = nums[0] < nums[1] ? 1 : 0;

			for (int j = 2; j < nums.length; j++) {
				if (nums[j] < nums[aliceIndex]) {
					bobIndex = aliceIndex;
					aliceIndex = j;
				} else if (nums[j] < nums[bobIndex]) {
					bobIndex = j;
				}
			}

			arr[2 * i] = nums[bobIndex];
			arr[2 * i + 1] = nums[aliceIndex];

			nums[aliceIndex] = Integer.MAX_VALUE;
			nums[bobIndex] = Integer.MAX_VALUE;
		}

		return arr;
	}
}
