package code.yakovenko.leetcode.java.easy;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

public final class CheckIfBitwiseORHasTrailingZerosTest {

	private final CheckIfBitwiseORHasTrailingZeros solution = new CheckIfBitwiseORHasTrailingZeros();

	@Test
	public void example1() {
		assertThat(solution.hasTrailingZeros(new int[]{1, 2, 3, 4, 5})).isTrue();
	}

	@Test
	public void example2() {
		assertThat(solution.hasTrailingZeros(new int[]{2, 4, 8, 16})).isTrue();
	}

	@Test
	public void example3() {
		assertThat(solution.hasTrailingZeros(new int[]{1, 3, 5, 7, 9})).isFalse();
	}
}
