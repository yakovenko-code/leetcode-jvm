package code.yakovenko.leetcode.java.easy;

public final class P2965FindMissingAndRepeatedValues {

	public int[] findMissingAndRepeatedValues(int[][] grid) {
		final int size = grid.length * grid.length;
		final boolean[] seen = new boolean[size];

		int repeated = 0;
		int sum = 0;

		for (final int[] row : grid) {
			for (final int element : row) {
				if (!seen[element - 1]) {
					seen[element - 1] = true;
					sum += element;
				} else {
					repeated = element;
				}
			}
		}

		return new int[]{repeated, (size * (size + 1)) / 2 - sum};
	}
}
