package code.yakovenko.leetcode.java.easy;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

public final class P1491AverageSalaryExcludingTheMinimumAndMaximumSalaryTest {

	private final P1491AverageSalaryExcludingTheMinimumAndMaximumSalary solution =
			new P1491AverageSalaryExcludingTheMinimumAndMaximumSalary();

	@Test
	public void example1() {
		assertThat(solution.average(new int[]{4000, 3000, 1000, 2000})).isEqualTo(2500.00000);
	}

	@Test
	public void example2() {
		assertThat(solution.average(new int[]{1000, 2000, 3000})).isEqualTo(2000.00000);
	}
}
