package code.yakovenko.leetcode.java.easy;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

public final class P0645SetMismatchTest {

	private final P0645SetMismatch solution = new P0645SetMismatch();

	@Test
	public void example1() {
		assertThat(solution.findErrorNums(new int[]{1, 2, 2, 4})).isEqualTo(new int[]{2, 3});
	}

	@Test
	public void example2() {
		assertThat(solution.findErrorNums(new int[]{1, 1})).isEqualTo(new int[]{1, 2});
	}
}
