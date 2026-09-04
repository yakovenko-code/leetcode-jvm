package code.yakovenko.leetcode.java.easy;

public final class SumMultiples {

	public int sumOfMultiples(int n) {
		int result = 0;

		result += sumDivisibleBy(n, 3);
		result += sumDivisibleBy(n, 5);
		result += sumDivisibleBy(n, 7);

		result -= sumDivisibleBy(n, 3 * 5);
		result -= sumDivisibleBy(n, 3 * 7);
		result -= sumDivisibleBy(n, 5 * 7);

		result += sumDivisibleBy(n, 3 * 5 * 7);

		return result;
	}

	private int sumDivisibleBy(int n, int k) {
		int m = n / k;
		return k * m * (m + 1) / 2;
	}
}
