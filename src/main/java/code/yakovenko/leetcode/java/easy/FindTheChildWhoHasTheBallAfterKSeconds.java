package code.yakovenko.leetcode.java.easy;

public final class FindTheChildWhoHasTheBallAfterKSeconds {

	public int numberOfChild(int n, int k) {
		final int cycle = n - 1;
		final int direction = (k / cycle) % 2;
		final int position = k % cycle;

		return direction == 0 ? position : cycle - position;
	}
}
