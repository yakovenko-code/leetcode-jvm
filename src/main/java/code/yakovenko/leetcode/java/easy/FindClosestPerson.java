package code.yakovenko.leetcode.java.easy;

public final class FindClosestPerson {

	public int findClosest(int x, int y, int z) {
		final int xDistance = Math.abs(z - x);
		final int yDistance = Math.abs(z - y);

		if (xDistance < yDistance) {
			return 1;
		} else if (yDistance < xDistance) {
			return 2;
		} else {
			return 0;
		}
	}
}
