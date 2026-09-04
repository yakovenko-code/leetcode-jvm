package code.yakovenko.leetcode.java.easy;

public final class FindTheDifference {

	public char findTheDifference(String s, String t) {
		final int size = s.length();
		int xor = t.charAt(size);

		for (int i = 0; i < size; i++) {
			xor ^= s.charAt(i) ^ t.charAt(i);
		}

		return (char) xor;
	}
}
