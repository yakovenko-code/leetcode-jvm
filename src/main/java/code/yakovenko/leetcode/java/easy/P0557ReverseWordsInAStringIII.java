package code.yakovenko.leetcode.java.easy;

public final class P0557ReverseWordsInAStringIII {

	public String reverseWords(String s) {
		final char[] characters = s.toCharArray();
		int wordStart = 0;

		for (int i = 0; i <= characters.length; i++) {
			if (i == characters.length || characters[i] == ' ') {
				reverse(characters, wordStart, i - 1);
				wordStart = i + 1;
			}
		}

		return new String(characters);
	}

	private void reverse(final char[] characters, int left, int right) {
		while (left < right) {
			final char temp = characters[left];
			characters[left++] = characters[right];
			characters[right--] = temp;
		}
	}
}
