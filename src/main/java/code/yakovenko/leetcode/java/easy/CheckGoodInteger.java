package code.yakovenko.leetcode.java.easy;

public final class CheckGoodInteger {

	public boolean checkGoodInteger(int n) {
		int digitSum = 0, squareSum = 0;

		while (n != 0) {
			final int digit = n % 10;

			digitSum += digit;
			squareSum += digit * digit;

			n /= 10;
		}

		return squareSum - digitSum >= 50;
	}
}
