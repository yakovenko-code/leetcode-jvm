package code.yakovenko.leetcode.java.easy;

public final class PerfectNumber {

	public boolean checkPerfectNumber(int num) {
		if (num == 1) return false;

		final int sqrt = (int) Math.sqrt(num);
		int sum = 1;

		for (int i = 2; i <= sqrt; i++) {
			if (num % i == 0) {
				sum += i;

				if (i != num / i) {
					sum += num / i;
				}
			}
		}

		return num == sum;
	}
}
