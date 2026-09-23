package code.yakovenko.leetcode.java.easy;

public final class P2643RowWithMaximumOnes {

	public int[] rowAndMaximumOnes(int[][] mat) {
		int resultRowIndex = 0, maximumOnesCount = countOnes(mat[0]);

		for (int i = 1; i < mat.length; i++) {
			final int onesCount = countOnes(mat[i]);

			if (onesCount > maximumOnesCount) {
				maximumOnesCount = onesCount;
				resultRowIndex = i;
			}
		}

		return new int[]{resultRowIndex, maximumOnesCount};
	}

	private int countOnes(final int[] row) {
		int sum = 0;

		for (final int value : row) {
			sum += value;
		}

		return sum;
	}
}
