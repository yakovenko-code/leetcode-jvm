package code.yakovenko.leetcode.easy;

public final class ShuffleString {

	public String restoreString(String s, int[] indices) {
		final char[] result = new char[indices.length];

		for (int i = 0; i < indices.length; i++) {
			result[indices[i]] = s.charAt(i);
		}

		return new String(result);
	}
}
