package code.yakovenko.leetcode.java.easy;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

public final class NumberOfStepsToReduceANumberToZeroTest {

	private final NumberOfStepsToReduceANumberToZero solution =
			new NumberOfStepsToReduceANumberToZero();

	@Test
	public void example1() {
		assertThat(solution.numberOfSteps(14)).isEqualTo(6);
	}

	@Test
	public void example2() {
		assertThat(solution.numberOfSteps(8)).isEqualTo(4);
	}

	@Test
	public void example3() {
		assertThat(solution.numberOfSteps(123)).isEqualTo(12);
	}
}
