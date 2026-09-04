package code.yakovenko.leetcode.java.easy;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

public final class MaxConsecutiveOnesTest {

	private final MaxConsecutiveOnes solution = new MaxConsecutiveOnes();

	@Test
	public void example1() {
		assertThat(solution.findMaxConsecutiveOnes(new int[]{1, 1, 0, 1, 1, 1})).isEqualTo(3);
	}

	@Test
	public void example2() {
		assertThat(solution.findMaxConsecutiveOnes(new int[]{1, 0, 1, 1, 0, 1})).isEqualTo(2);
	}
}
