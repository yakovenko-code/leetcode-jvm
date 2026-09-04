package code.yakovenko.leetcode.java.easy;

public final class FindTheKeyOfTheNumbers {

	public int generateKey(int num1, int num2, int num3) {
		int key = 0;

		for (int i = 1000; i >= 1; i /= 10) {
			final int digit = Math.min(num1 / i % 10, Math.min(num2 / i % 10, num3 / i % 10));

			key = key * 10 + digit;
		}

		return key;
	}
}
