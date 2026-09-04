package code.yakovenko.leetcode.java.easy;

public final class PercentageOfLetterInString {

	public int percentageLetter(String s, char letter) {
		int count = 0;

		for (int i = 0; i < s.length(); i++) {
			count += s.charAt(i) == letter ? 1 : 0;
		}

		return count * 100 / s.length();
	}
}
