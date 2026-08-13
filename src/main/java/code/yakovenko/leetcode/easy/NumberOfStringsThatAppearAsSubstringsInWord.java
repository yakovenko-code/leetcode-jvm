package code.yakovenko.leetcode.easy;

public final class NumberOfStringsThatAppearAsSubstringsInWord {

	public int numOfStrings(String[] patterns, String word) {
		int count = 0;

		for (final String pattern : patterns) {
			if (word.contains(pattern)) {
				count++;
			}
		}

		return count;
	}
}
