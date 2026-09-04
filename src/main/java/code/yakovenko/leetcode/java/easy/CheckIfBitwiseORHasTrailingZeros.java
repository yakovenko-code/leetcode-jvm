package code.yakovenko.leetcode.java.easy;

public final class CheckIfBitwiseORHasTrailingZeros {

	public boolean hasTrailingZeros(int[] nums) {
		boolean foundEven = false;

		for (final int num : nums) {
			if ((num & 1) == 0) {
				if (foundEven) {
					return true;
				}

				foundEven = true;
			}
		}

		return false;
	}
}
