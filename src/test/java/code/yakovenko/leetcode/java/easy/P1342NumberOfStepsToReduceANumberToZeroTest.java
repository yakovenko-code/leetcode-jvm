package code.yakovenko.leetcode.java.easy;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

public final class P1342NumberOfStepsToReduceANumberToZeroTest {

	private final P1342NumberOfStepsToReduceANumberToZero solution =
			new P1342NumberOfStepsToReduceANumberToZero();

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
