package code.yakovenko.leetcode.easy;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

public final class SeparateTheDigitsInAnArrayTest {

	private final SeparateTheDigitsInAnArray solution = new SeparateTheDigitsInAnArray();

	@Test
	public void example1() {
		assertThat(solution.separateDigits(new int[]{13, 25, 83, 77})).isEqualTo(new int[]{1, 3, 2, 5, 8, 3, 7, 7});
	}

	@Test
	public void example2() {
		assertThat(solution.separateDigits(new int[]{7, 1, 3, 9})).isEqualTo(new int[]{7, 1, 3, 9});
	}
}
