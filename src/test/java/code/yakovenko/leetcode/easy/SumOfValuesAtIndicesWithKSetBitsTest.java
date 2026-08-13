package code.yakovenko.leetcode.easy;

import org.junit.jupiter.api.Test;

import java.util.List;

import static org.assertj.core.api.Assertions.assertThat;

public final class SumOfValuesAtIndicesWithKSetBitsTest {

	private final SumOfValuesAtIndicesWithKSetBits solution = new SumOfValuesAtIndicesWithKSetBits();

	@Test
	public void test1() {
		assertThat(solution.sumIndicesWithKSetBits(List.of(5, 10, 1, 5, 2), 1)).isEqualTo(13);
	}

	@Test
	public void test2() {
		assertThat(solution.sumIndicesWithKSetBits(List.of(4, 3, 2, 1), 2)).isEqualTo(1);
	}
}
