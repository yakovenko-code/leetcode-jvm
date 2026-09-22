package code.yakovenko.leetcode.java.easy;

public final class P2833FurthestPointFromOrigin {

	public int furthestDistanceFromOrigin(String moves) {
		int left = 0, right = 0, any = 0;

		for (final char move : moves.toCharArray()) {
			if (move == 'L') {
				left++;
			} else if (move == 'R') {
				right++;
			} else {
				any++;
			}
		}

		return Math.abs(left - right) + any;
	}
}
