package code.yakovenko.leetcode.java.easy;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

public final class P0070ClimbingStairsTest {

	private final P0070ClimbingStairs solution = new P0070ClimbingStairs();

	@Test
	public void example1() {
		assertThat(solution.climbStairs(2)).isEqualTo(2);
	}

	@Test
	public void example2() {
		assertThat(solution.climbStairs(3)).isEqualTo(3);
	}
}
