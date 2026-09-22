package code.yakovenko.leetcode.java.easy;

public final class P0476NumberComplement {

	public int findComplement(int num) {
		int result = 0;
		int bit = 1;

		do {
			if ((num & 1) == 0) {
				result |= bit;
			}

			num >>= 1;
			bit <<= 1;
		} while (num != 0);

		return result;
	}
}
