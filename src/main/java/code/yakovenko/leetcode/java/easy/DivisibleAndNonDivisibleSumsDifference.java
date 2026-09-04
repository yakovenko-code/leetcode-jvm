package code.yakovenko.leetcode.java.easy;

public final class DivisibleAndNonDivisibleSumsDifference {

	public int differenceOfSums(int n, int m) {
		final int k = n / m;

		return n * (n + 1) / 2 - m * k * (k + 1);
	}
}
