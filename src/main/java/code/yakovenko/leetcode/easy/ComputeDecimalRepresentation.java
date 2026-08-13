package code.yakovenko.leetcode.easy;

public final class ComputeDecimalRepresentation {

	public int[] decimalRepresentation(int n) {
		final int[] result = new int[countDigits(n)];
		int i = result.length - 1;
		int multiplier = 1;

		while (i >= 0) {
			final int digit = n % 10;

			if (digit != 0) {
				result[i--] = digit * multiplier;
			}

			multiplier *= 10;
			n /= 10;
		}

		return result;
	}

	private int countDigits(int num) {
		int count = 0;

		while (num != 0) {
			if (num % 10 != 0) {
				count++;
			}

			num /= 10;
		}

		return count;
	}
}
