package code.yakovenko.leetcode.java.easy;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

public final class P3194MinimumAverageOfSmallestAndLargestElementsTest {

	private final P3194MinimumAverageOfSmallestAndLargestElements solution =
			new P3194MinimumAverageOfSmallestAndLargestElements();

	@Test
	public void example1() {
		assertThat(solution.minimumAverage(new int[]{7, 8, 3, 4, 15, 13, 4, 1})).isEqualTo(5.5);
	}

	@Test
	public void example2() {
		assertThat(solution.minimumAverage(new int[]{1, 9, 8, 3, 10, 5})).isEqualTo(5.5);
	}

	@Test
	public void example3() {
		assertThat(solution.minimumAverage(new int[]{1, 2, 3, 7, 8, 9})).isEqualTo(5.0);
	}
}
