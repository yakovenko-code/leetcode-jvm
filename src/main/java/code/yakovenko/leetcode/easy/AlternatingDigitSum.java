package code.yakovenko.leetcode.easy;

public final class AlternatingDigitSum {

	public int alternateDigitSum(int n) {
		int sign = 1;
		int sum = 0;

		while (n != 0) {
			sum += sign * (n % 10);
			sign *= -1;
			n /= 10;
		}

		return sign == 1 ? -sum : sum;
	}
}
