package code.yakovenko.leetcode.java.easy;

public final class ReverseString {

	public void reverseString(char[] s) {
		int left = 0, right = s.length - 1;

		while (left < right) {
			final char tmp = s[left];
			s[left++] = s[right];
			s[right--] = tmp;
		}
	}
}
