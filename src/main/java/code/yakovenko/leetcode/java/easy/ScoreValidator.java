package code.yakovenko.leetcode.java.easy;

public final class ScoreValidator {

	public int[] scoreValidator(String[] events) {
		int score = 0, counter = 0;

		for (int i = 0; i < events.length && counter != 10; i++) {
			final String event = events[i];
			final char firstChar = event.charAt(0);

			if (firstChar == 'W') {
				if (event.length() == 1) {
					counter++;
				} else {
					score++;
				}
			} else if (firstChar == 'N') {
				score++;
			} else {
				score += firstChar - '0';
			}
		}

		return new int[]{score, counter};
	}
}
