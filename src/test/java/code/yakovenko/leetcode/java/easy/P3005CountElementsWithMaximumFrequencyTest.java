package code.yakovenko.leetcode.java.easy;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

public final class P3005CountElementsWithMaximumFrequencyTest {

	private final P3005CountElementsWithMaximumFrequency solution = new P3005CountElementsWithMaximumFrequency();

	@Test
	public void example1() {
		assertThat(solution.maxFrequencyElements(new int[]{1, 2, 2, 3, 1, 4})).isEqualTo(4);
	}

	@Test
	public void example2() {
		assertThat(solution.maxFrequencyElements(new int[]{1, 2, 3, 4, 5})).isEqualTo(5);
	}
}
