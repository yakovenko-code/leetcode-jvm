package code.yakovenko.leetcode.java.easy;

public final class RestoreFinishingOrder {

	public int[] recoverOrder(int[] order, int[] friends) {
		final int[] result = new int[friends.length];
		final boolean[] isFriend = new boolean[order.length + 1];

		for (int friend : friends) {
			isFriend[friend] = true;
		}

		int index = 0;

		for (final int num : order) {
			if (isFriend[num]) {
				result[index++] = num;
			}
		}

		return result;
	}
}
