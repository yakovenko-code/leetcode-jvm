package code.yakovenko.leetcode.java.easy;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

public final class P2413SmallestEvenMultipleTest {

	private final P2413SmallestEvenMultiple solution = new P2413SmallestEvenMultiple();

	@Test
	public void example1() {
		assertThat(solution.smallestEvenMultiple(5)).isEqualTo(10);
	}

	@Test
	public void example2() {
		assertThat(solution.smallestEvenMultiple(6)).isEqualTo(6);
	}
}
