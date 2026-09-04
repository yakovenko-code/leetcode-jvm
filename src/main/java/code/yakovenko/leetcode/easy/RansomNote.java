package code.yakovenko.leetcode.easy;

public final class RansomNote {

	public boolean canConstruct(String ransomNote, String magazine) {
		if (ransomNote.length() > magazine.length()) return false;

		final int[] frequency = new int[26];

		for (final char character : magazine.toCharArray()) {
			frequency[character - 'a']++;
		}

		for (final char character : ransomNote.toCharArray()) {
			if (frequency[character - 'a'] == 0) {
				return false;
			}

			frequency[character - 'a']--;
		}

		return true;
	}
}
