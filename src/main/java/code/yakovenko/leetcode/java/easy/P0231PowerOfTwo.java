package code.yakovenko.leetcode.java.easy;

public final class P0231PowerOfTwo {

	public boolean isPowerOfTwo(int n) {
		if (n <= 0) return false;

		return (n & (n - 1)) == 0;
	}
}
