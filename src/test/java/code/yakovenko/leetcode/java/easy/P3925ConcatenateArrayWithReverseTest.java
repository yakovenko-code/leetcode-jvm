package code.yakovenko.leetcode.java.easy;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

public final class P3925ConcatenateArrayWithReverseTest {

	private final P3925ConcatenateArrayWithReverse solution = new P3925ConcatenateArrayWithReverse();

	@Test
	public void example1() {
		assertThat(solution.concatWithReverse(new int[]{1, 2, 3})).isEqualTo(new int[]{1, 2, 3, 3, 2, 1});
	}

	@Test
	public void example2() {
		assertThat(solution.concatWithReverse(new int[]{1})).isEqualTo(new int[]{1, 1});
	}
}
