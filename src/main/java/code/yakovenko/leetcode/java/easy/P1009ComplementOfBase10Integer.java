package code.yakovenko.leetcode.java.easy;

public final class P1009ComplementOfBase10Integer {

	public int bitwiseComplement(int n) {
		if (n == 0) return 1;

		int mask = 1;

		while (mask <= n) {
			mask <<= 1;
		}

		return n ^ (mask - 1);
	}
}
