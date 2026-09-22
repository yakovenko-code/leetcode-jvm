package code.yakovenko.leetcode.java.easy;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

public final class P0066PlusOneTest {

	private final P0066PlusOne solution = new P0066PlusOne();

	@Test
	public void example1() {
		assertThat(solution.plusOne(new int[]{1, 2, 3})).isEqualTo(new int[]{1, 2, 4});
	}

	@Test
	public void example2() {
		assertThat(solution.plusOne(new int[]{4, 3, 2, 1})).isEqualTo(new int[]{4, 3, 2, 2});
	}

	@Test
	public void example3() {
		assertThat(solution.plusOne(new int[]{9})).isEqualTo(new int[]{1, 0});
	}
}
