package code.yakovenko.leetcode.java.easy;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

public final class P2833FurthestPointFromOriginTest {

	private final P2833FurthestPointFromOrigin solution = new P2833FurthestPointFromOrigin();

	@Test
	public void example1() {
		assertThat(solution.furthestDistanceFromOrigin("L_RL__R")).isEqualTo(3);
	}

	@Test
	public void example2() {
		assertThat(solution.furthestDistanceFromOrigin("_R__LL_")).isEqualTo(5);
	}

	@Test
	public void example3() {
		assertThat(solution.furthestDistanceFromOrigin("_______")).isEqualTo(7);
	}
}
