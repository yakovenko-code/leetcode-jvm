package code.yakovenko.leetcode.java.easy;

public final class JewelsAndStones {

	public int numJewelsInStones(String jewels, String stones) {
		int result = 0;
		final boolean[] isJewel = new boolean[128];

		for (int i = 0; i < jewels.length(); i++) {
			isJewel[jewels.charAt(i)] = true;
		}

		for (int i = 0; i < stones.length(); i++) {
			if (isJewel[stones.charAt(i)]) {
				result++;
			}
		}

		return result;
	}
}
