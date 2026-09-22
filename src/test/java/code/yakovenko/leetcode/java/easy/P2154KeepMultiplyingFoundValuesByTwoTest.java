package code.yakovenko.leetcode.java.easy;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

public final class P2154KeepMultiplyingFoundValuesByTwoTest {

	private final P2154KeepMultiplyingFoundValuesByTwo solution = new P2154KeepMultiplyingFoundValuesByTwo();

	@Test
	public void example1() {
		assertThat(solution.findFinalValue(new int[]{5, 3, 6, 1, 12}, 3)).isEqualTo(24);
	}

	@Test
	public void example2() {
		assertThat(solution.findFinalValue(new int[]{2, 7, 9}, 4)).isEqualTo(4);
	}
}
