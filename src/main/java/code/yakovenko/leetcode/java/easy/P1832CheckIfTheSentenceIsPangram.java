package code.yakovenko.leetcode.java.easy;

public final class P1832CheckIfTheSentenceIsPangram {

	public boolean checkIfPangram(String sentence) {
		if (sentence.length() < 26) return false;

		for (char character = 'a'; character <= 'z'; character++) {
			if (sentence.indexOf(character) == -1) {
				return false;
			}
		}


		return true;
	}
}
