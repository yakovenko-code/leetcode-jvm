package code.yakovenko.leetcode.java.easy;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

public final class P0136SingleNumberTest {

	private final P0136SingleNumber solution = new P0136SingleNumber();

	@Test
	public void example1() {
		assertThat(solution.singleNumber(new int[]{2, 2, 1})).isEqualTo(1);
	}

	@Test
	public void example2() {
		assertThat(solution.singleNumber(new int[]{4, 1, 2, 1, 2})).isEqualTo(4);
	}

	@Test
	public void example3() {
		assertThat(solution.singleNumber(new int[]{1})).isEqualTo(1);
	}
}
