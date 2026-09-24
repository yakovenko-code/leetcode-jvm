package code.yakovenko.leetcode.java.medium;

public final class P0050PowXN {

	public double myPow(double x, int n) {
		return pow(x, n);
	}

	private double pow(final double x, final long n) {
		if (n == 0) return 1;

		if (n < 0) {
			return pow(1 / x, -n);
		}

		if (n % 2 == 0) {
			return pow(x * x, n / 2);
		} else {
			return x * pow(x * x, n / 2);
		}
	}
}
