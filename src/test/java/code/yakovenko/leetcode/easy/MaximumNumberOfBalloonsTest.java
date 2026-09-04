package code.yakovenko.leetcode.easy;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

public final class MaximumNumberOfBalloonsTest {

	private final MaximumNumberOfBalloons solution = new MaximumNumberOfBalloons();

	@Test
	public void example1() {
		assertThat(solution.maxNumberOfBalloons("nlaebolko")).isEqualTo(1);
	}

	@Test
	public void example2() {
		assertThat(solution.maxNumberOfBalloons("loonbalxballpoon")).isEqualTo(2);
	}

	@Test
	public void example3() {
		assertThat(solution.maxNumberOfBalloons("leetcode")).isEqualTo(0);
	}
}
