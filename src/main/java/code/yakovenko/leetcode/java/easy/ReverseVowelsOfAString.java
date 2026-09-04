package code.yakovenko.leetcode.java.easy;

public final class ReverseVowelsOfAString {

	private static final boolean[] IS_VOWEL = new boolean[256];

	static {
		for (char vowel : "aeiouAEIOU".toCharArray()) {
			IS_VOWEL[vowel] = true;
		}
	}

	public String reverseVowels(String s) {
		int left = 0, right = s.length() - 1;
		char[] chars = s.toCharArray();

		while (left < right) {
			while (left < right && !IS_VOWEL[chars[left]]) {
				left++;
			}

			while (left < right && !IS_VOWEL[chars[right]]) {
				right--;
			}

			char tmp = chars[left];
			chars[left++] = chars[right];
			chars[right--] = tmp;
		}

		return new String(chars);
	}
}
