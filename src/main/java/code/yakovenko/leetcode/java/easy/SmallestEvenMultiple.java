package code.yakovenko.leetcode.java.easy;

public final class SmallestEvenMultiple {

	public int smallestEvenMultiple(int n) {
		return n % 2 == 0 ? n : 2 * n;
	}
}
