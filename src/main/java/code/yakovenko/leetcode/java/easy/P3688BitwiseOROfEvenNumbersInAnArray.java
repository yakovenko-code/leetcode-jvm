package code.yakovenko.leetcode.java.easy;

public final class P3688BitwiseOROfEvenNumbersInAnArray {

	public int evenNumberBitwiseORs(int[] nums) {
		int result = 0;

		for (final int num : nums) {
			if ((num & 1) == 0) {
				result |= num;
			}
		}

		return result;
	}
}
