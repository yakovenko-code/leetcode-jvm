package code.yakovenko.leetcode.java.easy;

public final class ReverseOnlyLetters {

	public String reverseOnlyLetters(String s) {
		final char[] chars = s.toCharArray();
		int left = 0, right = s.length() - 1;

		while (left < right) {
			while (left < right && !Character.isLetter(chars[left])) {
				left++;
			}

			while (left < right && !Character.isLetter(chars[right])) {
				right--;
			}

			final char tmp = chars[left];
			chars[left++] = chars[right];
			chars[right--] = tmp;
		}

		return new String(chars);
	}
}
