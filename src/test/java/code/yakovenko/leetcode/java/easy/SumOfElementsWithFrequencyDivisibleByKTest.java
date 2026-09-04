package code.yakovenko.leetcode.java.easy;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

public final class SumOfElementsWithFrequencyDivisibleByKTest {

	private final SumOfElementsWithFrequencyDivisibleByK solution = new SumOfElementsWithFrequencyDivisibleByK();

	@Test
	public void example1() {
		assertThat(solution.sumDivisibleByK(new int[]{1, 2, 2, 3, 3, 3, 3, 4}, 2)).isEqualTo(16);
	}

	@Test
	public void example2() {
		assertThat(solution.sumDivisibleByK(new int[]{1, 2, 3, 4, 5}, 2)).isEqualTo(0);
	}

	@Test
	public void example3() {
		assertThat(solution.sumDivisibleByK(new int[]{4, 4, 4, 1, 2, 3}, 3)).isEqualTo(12);
	}
}
