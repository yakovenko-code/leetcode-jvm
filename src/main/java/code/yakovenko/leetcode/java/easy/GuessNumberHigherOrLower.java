package code.yakovenko.leetcode.java.easy;

import code.yakovenko.leetcode.java.design.GuessGame;

public final class GuessNumberHigherOrLower extends GuessGame {

	public int guessNumber(int n) {
		int left = 1, right = n;

		while (left <= right) {
			final int mid = left + (right - left) / 2;
			final int answer = guess(mid);

			if (answer == -1) {
				right = mid - 1;
			} else if (answer == 1) {
				left = mid + 1;
			} else {
				return mid;
			}
		}

		return -1;
	}
}
