package code.yakovenko.leetcode.easy;

public final class MatrixDiagonalSum {

	public int diagonalSum(int[][] mat) {
		int sum = 0;
		final int size = mat.length;

		for (int i = 0; i < size; i++) {
			sum += mat[i][i] + mat[i][size - 1 - i];
		}

		return size % 2 == 0 ? sum : sum - mat[size / 2][size / 2];
	}
}
