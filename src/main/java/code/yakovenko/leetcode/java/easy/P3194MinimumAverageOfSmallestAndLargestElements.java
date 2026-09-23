package code.yakovenko.leetcode.java.easy;

public final class P3194MinimumAverageOfSmallestAndLargestElements {

	public double minimumAverage(int[] nums) {
		double minimumAverage = Double.MAX_VALUE;

		for (int i = 0; i < nums.length / 2; i++) {
			int min = Integer.MAX_VALUE, max = Integer.MIN_VALUE;
			int minIndex = -1, maxIndex = -1;

			for (int j = 0; j < nums.length; j++) {
				final int num = nums[j];

				if (num != 0) {
					if (num > max) {
						max = num;
						maxIndex = j;
					}

					if (num < min) {
						min = num;
						minIndex = j;
					}
				}
			}

			nums[minIndex] = 0;
			nums[maxIndex] = 0;

			minimumAverage = Math.min(minimumAverage, (min + max) / 2.0);
		}

		return minimumAverage;
	}
}
