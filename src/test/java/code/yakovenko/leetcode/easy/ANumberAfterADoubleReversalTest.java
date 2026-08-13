package code.yakovenko.leetcode.easy;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

public final class ANumberAfterADoubleReversalTest {

	private final ANumberAfterADoubleReversal solution = new ANumberAfterADoubleReversal();

	@Test
	public void test1() {
		assertThat(solution.isSameAfterReversals(526)).isTrue();
	}

	@Test
	public void test2() {
		assertThat(solution.isSameAfterReversals(1800)).isFalse();
	}

	@Test
	public void test3() {
		assertThat(solution.isSameAfterReversals(0)).isTrue();
	}
}
