package code.yakovenko.leetcode.easy;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

public final class ComputeAlternatingSumTest {

	private final ComputeAlternatingSum solution = new ComputeAlternatingSum();

	@Test
	public void example1() {
		assertThat(solution.alternatingSum(new int[]{1, 3, 5, 7})).isEqualTo(-4);
	}

	@Test
	public void example2() {
		assertThat(solution.alternatingSum(new int[]{100})).isEqualTo(100);
	}
}
