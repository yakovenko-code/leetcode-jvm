package code.yakovenko.leetcode.easy;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

public final class ConcatenateArrayWithReverseTest {

	private final ConcatenateArrayWithReverse solution = new ConcatenateArrayWithReverse();

	@Test
	public void example1() {
		assertThat(solution.concatWithReverse(new int[]{1, 2, 3})).isEqualTo(new int[]{1, 2, 3, 3, 2, 1});
	}

	@Test
	public void example2() {
		assertThat(solution.concatWithReverse(new int[]{1})).isEqualTo(new int[]{1, 1});
	}
}
