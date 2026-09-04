package code.yakovenko.leetcode.java.easy;

public final class SingleNumber {

	public int singleNumber(int[] nums) {
		int xor = 0;

		for (final int num : nums) {
			xor ^= num;
		}

		return xor;
	}
}
