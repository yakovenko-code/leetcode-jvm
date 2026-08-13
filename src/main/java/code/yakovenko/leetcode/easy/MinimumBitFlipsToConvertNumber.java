package code.yakovenko.leetcode.easy;

public final class MinimumBitFlipsToConvertNumber {

	public int minBitFlips(int start, int goal) {
		return Integer.bitCount(start ^ goal);
	}
}
