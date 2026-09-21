package code.yakovenko.leetcode.java.easy;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

public final class NthTribonacciNumberTest {

	private final NthTribonacciNumber solution = new NthTribonacciNumber();

	@Test
	public void example1() {
		assertThat(solution.tribonacci(4)).isEqualTo(4);
	}

	@Test
	public void example2() {
		assertThat(solution.tribonacci(25)).isEqualTo(1389537);
	}
}
