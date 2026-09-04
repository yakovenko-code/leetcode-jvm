package code.yakovenko.leetcode.java.easy;

public final class TransposeMatrix {

	public int[][] transpose(int[][] matrix) {
		final int rows = matrix.length, columns = matrix[0].length;
		final int[][] transposedMatrix = new int[columns][rows];

		for (int i = 0; i < columns; i++) {
			for (int j = 0; j < rows; j++) {
				transposedMatrix[i][j] = matrix[j][i];
			}
		}

		return transposedMatrix;
	}
}
