package code.yakovenko.leetcode.java.easy;

public final class FindFirstPalindromicStringInTheArray {

	public String firstPalindrome(String[] words) {
		for (String word : words) {
			if (isPalindrome(word)) {
				return word;
			}
		}

		return "";
	}

	private boolean isPalindrome(final String word) {
		int left = 0, right = word.length() - 1;

		while (left < right) {
			if (word.charAt(left++) != word.charAt(right--)) {
				return false;
			}
		}

		return true;
	}
}
