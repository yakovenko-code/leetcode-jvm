package code.yakovenko.leetcode.easy;

public final class MinimumOperationsToMakeColumnsStrictlyIncreasing {

	public int minimumOperations(int[][] grid) {
		int operations = 0;

		for (int i = 1; i < grid.length; i++) {
			for (int j = 0; j < grid[i].length; j++) {
				if (grid[i - 1][j] - grid[i][j] >= 0) {
					final int difference = grid[i - 1][j] - grid[i][j];

					operations += difference + 1;
					grid[i][j] += difference + 1;
				}
			}
		}

		return operations;
	}
}
