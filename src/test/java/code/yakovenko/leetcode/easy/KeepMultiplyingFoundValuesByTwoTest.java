package code.yakovenko.leetcode.easy;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

public final class KeepMultiplyingFoundValuesByTwoTest {

	private final KeepMultiplyingFoundValuesByTwo solution = new KeepMultiplyingFoundValuesByTwo();

	@Test
	public void test1() {
		assertThat(solution.findFinalValue(new int[]{5, 3, 6, 1, 12}, 3)).isEqualTo(24);
	}

	@Test
	public void test2() {
		assertThat(solution.findFinalValue(new int[]{2, 7, 9}, 4)).isEqualTo(4);
	}
}
