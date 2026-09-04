package code.yakovenko.leetcode.java.easy;

public final class ReversePrefixOfWord {

	public String reversePrefix(String word, char ch) {
		int right;
		if ((right = word.indexOf(ch)) == -1) return word;

		final char[] chars = word.toCharArray();
		int left = 0;

		while (left < right) {
			final char tmp = chars[left];
			chars[left++] = chars[right];
			chars[right--] = tmp;
		}

		return new String(chars);
	}
}
