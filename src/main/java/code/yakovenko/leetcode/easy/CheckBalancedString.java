package code.yakovenko.leetcode.easy;

public final class CheckBalancedString {

	public boolean isBalanced(String num) {
		final int size = num.length();
		int balance = 0;

		for (int i = 0; i < size; i++) {
			balance += (i % 2 == 0 ? 1 : -1) * (num.charAt(i) - '0');
		}

		return balance == 0;
	}
}
