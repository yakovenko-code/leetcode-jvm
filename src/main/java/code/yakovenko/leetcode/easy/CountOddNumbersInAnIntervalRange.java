package code.yakovenko.leetcode.easy;

public final class CountOddNumbersInAnIntervalRange {

	public int countOdds(int low, int high) {
		return (((high - 1) | 1) - (low | 1)) / 2 + 1;
	}
}
