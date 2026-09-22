package code.yakovenko.leetcode.java.easy;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

public final class P0509FibonacciNumberTest {

	private final P0509FibonacciNumber solution = new P0509FibonacciNumber();

	@Test
	public void example1() {
		assertThat(solution.fib(2)).isEqualTo(1);
	}

	@Test
	public void example2() {
		assertThat(solution.fib(3)).isEqualTo(2);
	}

	@Test
	public void example3() {
		assertThat(solution.fib(4)).isEqualTo(3);
	}
}
