package code.yakovenko.leetcode.java.easy;

public final class DifferenceBetweenElementSumAndDigitSumOfAnArray {

	public int differenceOfSum(int[] nums) {
		int elementSum = 0, digitSum = 0;

		for (final int num : nums) {
			elementSum += num;
			digitSum += sumOfDigits(num);
		}

		return Math.abs(elementSum - digitSum);
	}

	private int sumOfDigits(int num) {
		int sum = 0;

		while (num != 0) {
			sum += num % 10;
			num /= 10;
		}

		return sum;
	}
}
