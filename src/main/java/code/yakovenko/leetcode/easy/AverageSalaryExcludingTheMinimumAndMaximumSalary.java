package code.yakovenko.leetcode.easy;

public final class AverageSalaryExcludingTheMinimumAndMaximumSalary {

	public double average(int[] salary) {
		int sum = 0;
		int max = Integer.MIN_VALUE, min = Integer.MAX_VALUE;

		for (final int num : salary) {
			sum += num;
			max = Math.max(max, num);
			min = Math.min(min, num);
		}

		return (double) (sum - max - min) / (salary.length - 2);
	}
}
