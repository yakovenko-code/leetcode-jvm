package code.yakovenko.leetcode.java.easy;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

public final class P1920BuildArrayFromPermutationTest {

	private final P1920BuildArrayFromPermutation solution = new P1920BuildArrayFromPermutation();

	@Test
	public void example1() {
		assertThat(solution.buildArray(new int[]{0, 2, 1, 5, 3, 4})).isEqualTo(new int[]{0, 1, 2, 4, 5, 3});
	}

	@Test
	public void example2() {
		assertThat(solution.buildArray(new int[]{5, 0, 1, 2, 3, 4})).isEqualTo(new int[]{4, 5, 0, 1, 2, 3});
	}
}
