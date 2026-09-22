package code.yakovenko.leetcode.java.easy;

public final class P2220MinimumBitFlipsToConvertNumber {

	public int minBitFlips(int start, int goal) {
		return Integer.bitCount(start ^ goal);
	}
}
