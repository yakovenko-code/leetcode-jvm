package code.yakovenko.leetcode.easy;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

public final class SmallestEvenMultipleTest {

	private final SmallestEvenMultiple solution = new SmallestEvenMultiple();

	@Test
	public void example1() {
		assertThat(solution.smallestEvenMultiple(5)).isEqualTo(10);
	}

	@Test
	public void example2() {
		assertThat(solution.smallestEvenMultiple(6)).isEqualTo(6);
	}
}
