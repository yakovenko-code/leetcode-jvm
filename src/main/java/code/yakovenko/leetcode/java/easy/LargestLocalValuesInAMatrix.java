package code.yakovenko.leetcode.java.easy;

public final class LargestLocalValuesInAMatrix {

	public int[][] largestLocal(int[][] grid) {
		final int size = grid.length;
		final int[][] result = new int[size - 2][size - 2];

		for (int i = 1; i < size - 1; i++) {
			for (int j = 1; j < size - 1; j++) {
				int max = 0;

				for (int row = i - 1; row <= i + 1; row++) {
					for (int column = j - 1; column <= j + 1; column++) {
						max = Math.max(max, grid[row][column]);
					}
				}

				result[i - 1][j - 1] = max;
			}
		}

		return result;
	}
}
