package code.yakovenko.leetcode.easy;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

public final class NumberOfStepsToReduceANumberToZeroTest {

	private final NumberOfStepsToReduceANumberToZero solution =
			new NumberOfStepsToReduceANumberToZero();

	@Test
	public void test1() {
		assertThat(solution.numberOfSteps(14)).isEqualTo(6);
	}

	@Test
	public void test2() {
		assertThat(solution.numberOfSteps(8)).isEqualTo(4);
	}

	@Test
	public void test3() {
		assertThat(solution.numberOfSteps(123)).isEqualTo(12);
	}
}
