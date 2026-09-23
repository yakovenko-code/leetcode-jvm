package code.yakovenko.leetcode.java.easy;

public final class P0387FirstUniqueCharacterInAString {

	public int firstUniqChar(String s) {
		final char[] characters = s.toCharArray();
		final int[] frequency = new int[26];

		for (final char character : characters) {
			frequency[character - 'a']++;
		}

		for (int i = 0; i < characters.length; i++) {
			if (frequency[characters[i] - 'a'] == 1) {
				return i;
			}
		}

		return -1;
	}
}
