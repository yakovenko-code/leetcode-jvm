package code.yakovenko.leetcode.java.easy;

public final class SmallestNumberWithAllSetBits {

	public int smallestNumber(int n) {
		return (int) (Math.pow(2, (int) (Math.log(n) / Math.log(2)) + 1) - 1);
	}
}
