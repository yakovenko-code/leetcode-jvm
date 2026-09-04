package code.yakovenko.leetcode.java.easy;

public final class CheckIfMatrixIsXMatrix {

	public boolean checkXMatrix(int[][] grid) {
		final int size = grid.length;

		for (int i = 0; i < size; i++) {
			if (grid[i][i] == 0 || grid[i][size - 1 - i] == 0) {
				return false;
			}

			for (int j = 0; j < size; j++) {
				if (j != i && j != size - 1 - i && grid[i][j] != 0) {
					return false;
				}
			}
		}

		return true;
	}
}
