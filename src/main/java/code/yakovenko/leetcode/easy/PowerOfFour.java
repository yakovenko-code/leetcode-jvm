package code.yakovenko.leetcode.easy;

public final class PowerOfFour {

	public boolean isPowerOfFour(int n) {
		return n > 0 && (n & (n - 1)) == 0 && Integer.bitCount(n - 1) % 2 == 0;
	}
}
