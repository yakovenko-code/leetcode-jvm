package code.yakovenko.leetcode.java.easy;

public final class P1967NumberOfStringsThatAppearAsSubstringsInWord {

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
