package code.yakovenko.leetcode.easy;

public final class SeparateTheDigitsInAnArray {

	public int[] separateDigits(int[] nums) {
		int count = 0;

		for (int num : nums) {
			while (num != 0) {
				count++;
				num /= 10;
			}
		}

		final int[] result = new int[count];
		int position = count - 1;

		for (int i = nums.length - 1; i >= 0; i--) {
			int num = nums[i];

			while (num != 0) {
				result[position--] = num % 10;
				num /= 10;
			}
		}

		return result;
	}
}
