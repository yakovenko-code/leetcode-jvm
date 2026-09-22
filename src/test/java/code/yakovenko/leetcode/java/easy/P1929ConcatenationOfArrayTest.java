package code.yakovenko.leetcode.java.easy;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

public final class P1929ConcatenationOfArrayTest {

	private final P1929ConcatenationOfArray solution = new P1929ConcatenationOfArray();

	@Test
	public void example1() {
		assertThat(solution.getConcatenation(new int[]{1, 2, 1})).isEqualTo(new int[]{1, 2, 1, 1, 2, 1});
	}

	@Test
	public void example2() {
		assertThat(solution.getConcatenation(new int[]{1, 3, 2, 1})).isEqualTo(new int[]{1, 3, 2, 1, 1, 3, 2, 1});
	}
}
