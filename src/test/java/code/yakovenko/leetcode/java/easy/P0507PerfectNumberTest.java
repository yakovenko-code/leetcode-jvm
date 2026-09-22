package code.yakovenko.leetcode.java.easy;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

public final class P0507PerfectNumberTest {

	private final P0507PerfectNumber solution = new P0507PerfectNumber();

	@Test
	public void example1() {
		assertThat(solution.checkPerfectNumber(28)).isTrue();
	}

	@Test
	public void example2() {
		assertThat(solution.checkPerfectNumber(7)).isFalse();
	}
}
