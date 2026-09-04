package code.yakovenko.leetcode.java.easy;

public final class FindTheDegreeOfEachVertex {

	public int[] findDegrees(int[][] matrix) {
		final int[] result = new int[matrix.length];

		for (int i = 0; i < result.length; i++) {
			result[i] = sum(matrix[i]);
		}

		return result;
	}

	private int sum(final int[] array) {
		int sum = 0;

		for (final int num : array) {
			sum += num;
		}

		return sum;
	}
}
