package code.yakovenko.leetcode.java.easy;

public final class CircularSentence {

	public boolean isCircularSentence(String sentence) {
		int spaceIndex = -1;

		while ((spaceIndex = sentence.indexOf(' ', spaceIndex + 1)) != -1) {
			if (sentence.charAt(spaceIndex - 1) != sentence.charAt(spaceIndex + 1)) {
				return false;
			}
		}

		return sentence.charAt(0) == sentence.charAt(sentence.length() - 1);
	}
}
