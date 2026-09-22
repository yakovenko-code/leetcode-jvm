package code.yakovenko.leetcode.java.easy;

public final class P2582PassThePillow {

	public int passThePillow(int n, int time) {
		final int cycle = n - 1;
		final int direction = (time / cycle) % 2;
		final int position = time % cycle;

		return (direction == 0 ? position : cycle - position) + 1;
	}
}
