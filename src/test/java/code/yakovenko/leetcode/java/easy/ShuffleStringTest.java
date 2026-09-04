package code.yakovenko.leetcode.java.easy;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

public final class ShuffleStringTest {

	private final ShuffleString solution = new ShuffleString();

	@Test
	public void example1() {
		assertThat(solution.restoreString("codeleet", new int[]{4, 5, 6, 7, 0, 2, 1, 3})).isEqualTo("leetcode");
	}

	@Test
	public void example2() {
		assertThat(solution.restoreString("abc", new int[]{0, 1, 2})).isEqualTo("abc");
	}
}
