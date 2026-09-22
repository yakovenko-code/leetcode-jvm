package code.yakovenko.leetcode.java.easy;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

public final class P2119ANumberAfterADoubleReversalTest {

	private final P2119ANumberAfterADoubleReversal solution = new P2119ANumberAfterADoubleReversal();

	@Test
	public void example1() {
		assertThat(solution.isSameAfterReversals(526)).isTrue();
	}

	@Test
	public void example2() {
		assertThat(solution.isSameAfterReversals(1800)).isFalse();
	}

	@Test
	public void example3() {
		assertThat(solution.isSameAfterReversals(0)).isTrue();
	}
}
