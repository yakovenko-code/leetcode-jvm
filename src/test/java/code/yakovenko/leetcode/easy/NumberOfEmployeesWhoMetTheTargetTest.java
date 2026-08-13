package code.yakovenko.leetcode.easy;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

public final class NumberOfEmployeesWhoMetTheTargetTest {

	private final NumberOfEmployeesWhoMetTheTarget solution = new NumberOfEmployeesWhoMetTheTarget();

	@Test
	public void example1() {
		assertThat(solution.numberOfEmployeesWhoMetTarget(new int[]{0, 1, 2, 3, 4}, 2)).isEqualTo(3);
	}

	@Test
	public void example2() {
		assertThat(solution.numberOfEmployeesWhoMetTarget(new int[]{5, 1, 4, 2, 2}, 6)).isEqualTo(0);
	}
}
