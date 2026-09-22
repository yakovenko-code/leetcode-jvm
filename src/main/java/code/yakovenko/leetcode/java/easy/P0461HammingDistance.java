package code.yakovenko.leetcode.java.easy;

public final class P0461HammingDistance {

	public int hammingDistance(int x, int y) {
		return Integer.bitCount(x ^ y);
	}
}
