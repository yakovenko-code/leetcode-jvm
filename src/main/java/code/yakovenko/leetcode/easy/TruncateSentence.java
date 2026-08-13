package code.yakovenko.leetcode.easy;

public final class TruncateSentence {

	public String truncateSentence(String s, int k) {
		int wordsCount = 0;
		int endIndex = s.length();

		for (int i = 0; i < s.length(); i++) {
			if (s.charAt(i) == ' ') {
				wordsCount++;

				if (wordsCount == k) {
					endIndex = i;
					break;
				}
			}
		}

		return s.substring(0, endIndex);
	}
}
