package code.yakovenko.leetcode.easy;

public final class RedistributeCharactersToMakeAllStringsEqual {

	public boolean makeEqual(String[] words) {
		final int[] frequency = new int[26];

		for (final String word : words) {
			for (final char character : word.toCharArray()) {
				frequency[character - 'a']++;
			}
		}

		for (final int num : frequency) {
			if (num % words.length != 0) {
				return false;
			}
		}

		return true;
	}
}
