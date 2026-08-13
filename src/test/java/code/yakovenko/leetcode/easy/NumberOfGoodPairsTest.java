package code.yakovenko.leetcode.easy;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

public final class NumberOfGoodPairsTest {

	private final NumberOfGoodPairs solution = new NumberOfGoodPairs();

	@Test
	public void example1() {
		assertThat(solution.numIdenticalPairs(new int[]{1, 2, 3, 1, 1, 3})).isEqualTo(4);
	}

	@Test
	public void example2() {
		assertThat(solution.numIdenticalPairs(new int[]{1, 1, 1, 1})).isEqualTo(6);
	}

	@Test
	public void example3() {
		assertThat(solution.numIdenticalPairs(new int[]{1, 2, 3})).isEqualTo(0);
	}
}
