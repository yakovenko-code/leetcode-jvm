package code.yakovenko.leetcode.java.easy;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

public final class SmallestIndexWithDigitSumEqualToIndexTest {

	private final SmallestIndexWithDigitSumEqualToIndex solution = new SmallestIndexWithDigitSumEqualToIndex();

	@Test
	public void example1() {
		assertThat(solution.smallestIndex(new int[]{1, 3, 2})).isEqualTo(2);
	}

	@Test
	public void example2() {
		assertThat(solution.smallestIndex(new int[]{1, 10, 11})).isEqualTo(1);
	}

	@Test
	public void example3() {
		assertThat(solution.smallestIndex(new int[]{1, 2, 3})).isEqualTo(-1);
	}
}
