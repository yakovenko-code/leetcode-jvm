package code.yakovenko.leetcode.java.easy;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

public final class WeightedWordMappingTest {

	private final WeightedWordMapping solution = new WeightedWordMapping();

	@Test
	public void example1() {
		assertThat(
				solution.mapWordWeights(
						new String[]{"abcd", "def", "xyz"},
						new int[]{5, 3, 12, 14, 1, 2, 3, 2, 10, 6, 6, 9, 7, 8, 7, 10, 8, 9, 6, 9, 9, 8, 3, 7, 7, 2}
				)
		).isEqualTo("rij");
	}

	@Test
	public void example2() {
		assertThat(
				solution.mapWordWeights(
						new String[]{"a", "b", "c"},
						new int[]{1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1}
				)
		).isEqualTo("yyy");
	}

	@Test
	public void example3() {
		assertThat(
				solution.mapWordWeights(
						new String[]{"abcd"},
						new int[]{7, 5, 3, 4, 3, 5, 4, 9, 4, 2, 2, 7, 10, 2, 5, 10, 6, 1, 2, 2, 4, 1, 3, 4, 4, 5}
				)
		).isEqualTo("g");
	}
}
