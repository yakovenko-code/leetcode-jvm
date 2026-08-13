package code.yakovenko.leetcode.easy;

public final class CheckIfWordEqualsSummationOfTwoWords {

	public boolean isSumEqual(String firstWord, String secondWord, String targetWord) {
		return toInt(firstWord) + toInt(secondWord) == toInt(targetWord);
	}

	private int toInt(final String word) {
		int number = 0;

		for (final char character : word.toCharArray()) {
			number = number * 10 + (character - 'a');
		}

		return number;
	}
}
