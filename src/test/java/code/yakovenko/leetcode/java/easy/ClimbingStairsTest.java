package code.yakovenko.leetcode.java.easy;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

public final class ClimbingStairsTest {

	private final ClimbingStairs solution = new ClimbingStairs();

	@Test
	public void example1() {
		assertThat(solution.climbStairs(2)).isEqualTo(2);
	}

	@Test
	public void example2() {
		assertThat(solution.climbStairs(3)).isEqualTo(3);
	}
}
