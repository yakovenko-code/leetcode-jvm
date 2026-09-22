package code.yakovenko.leetcode.java.easy;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

public final class P0263UglyNumberTest {

	private final P0263UglyNumber solution = new P0263UglyNumber();

	@Test
	public void example1() {
		assertThat(solution.isUgly(6)).isTrue();
	}

	@Test
	public void example2() {
		assertThat(solution.isUgly(1)).isTrue();
	}

	@Test
	public void example3() {
		assertThat(solution.isUgly(14)).isFalse();
	}
}
