package code.yakovenko.leetcode.easy;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

public final class MinimumElementAfterReplacementWithDigitSumTest {

	private final MinimumElementAfterReplacementWithDigitSum solution =
			new MinimumElementAfterReplacementWithDigitSum();

	@Test
	public void example1() {
		assertThat(solution.minElement(new int[]{10, 12, 13, 14})).isEqualTo(1);
	}

	@Test
	public void example2() {
		assertThat(solution.minElement(new int[]{1, 2, 3, 4})).isEqualTo(1);
	}

	@Test
	public void example3() {
		assertThat(solution.minElement(new int[]{999, 19, 199})).isEqualTo(10);
	}
}
