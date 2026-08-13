package code.yakovenko.leetcode.easy;

public final class CountTheNumberOfConsistentStrings {

	public int countConsistentStrings(String allowed, String[] words) {
		final boolean[] isContain = new boolean[26];
		int counter = 0;

		for (int i = 0; i < allowed.length(); i++) {
			isContain[allowed.charAt(i) - 'a'] = true;
		}

		for (final String word : words) {
			boolean isConsistent = true;

			for (int i = 0; i < word.length(); i++) {
				if (!isContain[word.charAt(i) - 'a']) {
					isConsistent = false;
					break;
				}
			}

			if (isConsistent) {
				counter++;
			}
		}

		return counter;
	}
}
