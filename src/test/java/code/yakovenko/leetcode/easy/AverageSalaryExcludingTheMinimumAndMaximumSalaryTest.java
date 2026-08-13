package code.yakovenko.leetcode.easy;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

public final class AverageSalaryExcludingTheMinimumAndMaximumSalaryTest {

	private final AverageSalaryExcludingTheMinimumAndMaximumSalary solution =
			new AverageSalaryExcludingTheMinimumAndMaximumSalary();

	@Test
	public void test1() {
		assertThat(solution.average(new int[]{4000, 3000, 1000, 2000})).isEqualTo(2500.00000);
	}

	@Test
	public void test2() {
		assertThat(solution.average(new int[]{1000, 2000, 3000})).isEqualTo(2000.00000);
	}
}
