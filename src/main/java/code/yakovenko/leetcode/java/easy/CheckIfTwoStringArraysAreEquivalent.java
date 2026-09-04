package code.yakovenko.leetcode.java.easy;

public final class CheckIfTwoStringArraysAreEquivalent {

	public boolean arrayStringsAreEqual(String[] word1, String[] word2) {
		return String.join("", word1).equals(String.join("", word2));
	}
}
