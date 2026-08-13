package code.yakovenko.leetcode.easy;

public final class DecodeXORedArray {

	public int[] decode(int[] encoded, int first) {
		final int[] result = new int[encoded.length + 1];
		result[0] = first;

		for (int i = 0; i < encoded.length; i++) {
			result[i + 1] = result[i] ^ encoded[i];
		}

		return result;
	}
}
