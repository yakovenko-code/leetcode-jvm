package code.yakovenko.leetcode.java.easy;

public final class ReverseStringPrefix {

	public String reversePrefix(String s, int k) {
		final char[] chars = s.toCharArray();
		int left = 0, right = k - 1;

		while (left < right) {
			final char tmp = chars[left];
			chars[left++] = chars[right];
			chars[right--] = tmp;
		}

		return new String(chars);
	}
}
