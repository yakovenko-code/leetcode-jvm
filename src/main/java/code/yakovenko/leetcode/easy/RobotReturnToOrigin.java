package code.yakovenko.leetcode.easy;

public final class RobotReturnToOrigin {

	public boolean judgeCircle(String moves) {
		if (moves.length() % 2 != 0) return false;

		int x = 0, y = 0;

		for (final char character : moves.toCharArray()) {
			switch (character) {
				case 'R' -> x++;
				case 'L' -> x--;
				case 'U' -> y++;
				case 'D' -> y--;
			}
		}

		return y == 0 && x == 0;
	}
}
