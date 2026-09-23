package code.yakovenko.leetcode.java.easy;

public final class P0268MissingNumber {

	public int missingNumber(int[] nums) {
		int xor = nums.length;

		for (int i = 0; i < nums.length; i++) {
			xor ^= i ^ nums[i];
		}

		return xor;
	}
}
