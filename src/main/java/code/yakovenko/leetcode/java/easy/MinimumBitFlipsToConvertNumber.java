package code.yakovenko.leetcode.java.easy;

public final class MinimumBitFlipsToConvertNumber {

	public int minBitFlips(int start, int goal) {
		return Integer.bitCount(start ^ goal);
	}
}
