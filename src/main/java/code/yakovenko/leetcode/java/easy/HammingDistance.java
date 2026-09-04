package code.yakovenko.leetcode.java.easy;

public final class HammingDistance {

	public int hammingDistance(int x, int y) {
		return Integer.bitCount(x ^ y);
	}
}
