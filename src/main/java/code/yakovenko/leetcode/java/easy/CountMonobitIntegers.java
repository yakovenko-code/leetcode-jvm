package code.yakovenko.leetcode.java.easy;

public final class CountMonobitIntegers {

	public int countMonobit(int n) {
		int count = 0;
		int monobit = 0;

		while (monobit <= n) {
			count++;
			monobit = (monobit << 1) | 1;
		}

		return count;
	}
}
