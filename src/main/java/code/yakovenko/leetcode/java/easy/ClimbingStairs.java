package code.yakovenko.leetcode.java.easy;

public final class ClimbingStairs {

	public int climbStairs(int n) {
		if (n <= 2) return n;

		int prev2 = 1;
		int prev1 = 2;

		for (int i = 3; i <= n; i++) {
			prev1 += prev2;
			prev2 = prev1 - prev2;
		}

		return prev1;
	}
}
