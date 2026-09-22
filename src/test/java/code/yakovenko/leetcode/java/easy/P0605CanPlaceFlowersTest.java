package code.yakovenko.leetcode.java.easy;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

public final class P0605CanPlaceFlowersTest {

	private final P0605CanPlaceFlowers solution = new P0605CanPlaceFlowers();

	@Test
	public void example1() {
		assertThat(solution.canPlaceFlowers(new int[]{1, 0, 0, 0, 1}, 1)).isTrue();
	}

	@Test
	public void example2() {
		assertThat(solution.canPlaceFlowers(new int[]{1, 0, 0, 0, 1}, 2)).isFalse();
	}
}
