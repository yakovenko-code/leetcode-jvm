package code.yakovenko.leetcode.java.easy;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

public final class P0504Base7Test {

	private final P0504Base7 solution = new P0504Base7();

	@Test
	public void example1() {
		assertThat(solution.convertToBase7(100)).isEqualTo("202");
	}

	@Test
	public void example2() {
		assertThat(solution.convertToBase7(-7)).isEqualTo("-10");
	}
}
