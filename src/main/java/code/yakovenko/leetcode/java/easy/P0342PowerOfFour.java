package code.yakovenko.leetcode.java.easy;

public final class P0342PowerOfFour {

	public boolean isPowerOfFour(int n) {
		return n > 0 && (n & (n - 1)) == 0 && Integer.bitCount(n - 1) % 2 == 0;
	}
}
