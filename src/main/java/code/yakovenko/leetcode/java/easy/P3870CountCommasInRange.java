package code.yakovenko.leetcode.java.easy;

public final class P3870CountCommasInRange {

	public int countCommas(int n) {
		return Math.max(0, n - 999);
	}
}
