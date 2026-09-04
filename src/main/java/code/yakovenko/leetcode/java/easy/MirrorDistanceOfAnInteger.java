package code.yakovenko.leetcode.java.easy;

public final class MirrorDistanceOfAnInteger {

	public int mirrorDistance(int n) {
		return Math.abs(n - reverse(n));
	}

	private int reverse(int n) {
		int num = 0;

		while (n != 0) {
			num = num * 10 + n % 10;
			n /= 10;
		}

		return num;
	}
}
