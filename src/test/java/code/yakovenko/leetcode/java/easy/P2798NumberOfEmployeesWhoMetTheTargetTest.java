package code.yakovenko.leetcode.java.easy;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

public final class P2798NumberOfEmployeesWhoMetTheTargetTest {

	private final P2798NumberOfEmployeesWhoMetTheTarget solution = new P2798NumberOfEmployeesWhoMetTheTarget();

	@Test
	public void example1() {
		assertThat(solution.numberOfEmployeesWhoMetTarget(new int[]{0, 1, 2, 3, 4}, 2)).isEqualTo(3);
	}

	@Test
	public void example2() {
		assertThat(solution.numberOfEmployeesWhoMetTarget(new int[]{5, 1, 4, 2, 2}, 6)).isEqualTo(0);
	}
}
