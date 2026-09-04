package code.yakovenko.leetcode.java.easy;

public final class HarshadNumber {

	public int sumOfTheDigitsOfHarshadNumber(int x) {
		final int sum = digitSum(x);

		return x % sum == 0 ? sum : -1;
	}

	private int digitSum(int x) {
		int sum = 0;

		while (x != 0) {
			sum += x % 10;
			x /= 10;
		}

		return sum;
	}
}
