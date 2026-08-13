package code.yakovenko.leetcode.easy;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

public final class FinalValueOfVariableAfterPerformingOperationsTest {

	private final FinalValueOfVariableAfterPerformingOperations solution =
			new FinalValueOfVariableAfterPerformingOperations();

	@Test
	public void example1() {
		assertThat(solution.finalValueAfterOperations(new String[]{"--X", "X++", "X++"})).isEqualTo(1);
	}

	@Test
	public void example2() {
		assertThat(solution.finalValueAfterOperations(new String[]{"++X", "++X", "X++"})).isEqualTo(3);
	}

	@Test
	public void example3() {
		assertThat(solution.finalValueAfterOperations(new String[]{"X++", "++X", "--X", "X--"})).isEqualTo(0);
	}
}
