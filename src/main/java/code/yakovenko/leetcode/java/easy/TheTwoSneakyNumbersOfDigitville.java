package code.yakovenko.leetcode.java.easy;

public final class TheTwoSneakyNumbersOfDigitville {

	public int[] getSneakyNumbers(int[] nums) {
		final int[] result = new int[2];
		final int[] count = new int[nums.length - 2];

		int index = 0;

		for (final int num : nums) {
			if (++count[num] == 2) {
				result[index++] = num;

				if (index == 2) {
					break;
				}
			}
		}

		return result;
	}
}
