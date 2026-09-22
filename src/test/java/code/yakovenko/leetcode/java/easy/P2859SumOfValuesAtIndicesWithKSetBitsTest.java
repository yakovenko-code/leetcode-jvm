package code.yakovenko.leetcode.java.easy;

import org.junit.jupiter.api.Test;

import java.util.List;

import static org.assertj.core.api.Assertions.assertThat;

public final class P2859SumOfValuesAtIndicesWithKSetBitsTest {

	private final P2859SumOfValuesAtIndicesWithKSetBits solution = new P2859SumOfValuesAtIndicesWithKSetBits();

	@Test
	public void example1() {
		assertThat(solution.sumIndicesWithKSetBits(List.of(5, 10, 1, 5, 2), 1)).isEqualTo(13);
	}

	@Test
	public void example2() {
		assertThat(solution.sumIndicesWithKSetBits(List.of(4, 3, 2, 1), 2)).isEqualTo(1);
	}
}
