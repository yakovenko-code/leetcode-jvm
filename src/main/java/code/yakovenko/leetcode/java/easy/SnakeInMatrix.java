package code.yakovenko.leetcode.java.easy;

import java.util.List;

public final class SnakeInMatrix {

	public int finalPositionOfSnake(int n, List<String> commands) {
		int position = 0;

		for (final String command : commands) {
			switch (command.charAt(0)) {
				case 'U' -> position -= n;
				case 'R' -> position++;
				case 'D' -> position += n;
				case 'L' -> position--;
			}
		}

		return position;
	}
}
