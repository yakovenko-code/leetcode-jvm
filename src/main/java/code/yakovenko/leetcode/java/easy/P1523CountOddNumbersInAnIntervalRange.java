package code.yakovenko.leetcode.java.easy;

public final class P1523CountOddNumbersInAnIntervalRange {

	public int countOdds(int low, int high) {
		return (((high - 1) | 1) - (low | 1)) / 2 + 1;
	}
}
