package code.yakovenko.leetcode.java.easy;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

public final class P2965FindMissingAndRepeatedValuesTest {

	private final P2965FindMissingAndRepeatedValues solution = new P2965FindMissingAndRepeatedValues();

	@Test
	public void example1() {
		assertThat(solution.findMissingAndRepeatedValues(new int[][]{{1, 3}, {2, 2}}))
				.isEqualTo(new int[]{2, 4});
	}

	@Test
	public void example2() {
		assertThat(solution.findMissingAndRepeatedValues(new int[][]{{9, 1, 7}, {8, 9, 2}, {3, 4, 6}}))
				.isEqualTo(new int[]{9, 5});
	}
}
