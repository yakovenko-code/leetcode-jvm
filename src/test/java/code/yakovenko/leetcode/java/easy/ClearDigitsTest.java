package code.yakovenko.leetcode.java.easy;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

public final class ClearDigitsTest {

	private final ClearDigits solution = new ClearDigits();

	@Test
	public void example1() {
		assertThat(solution.clearDigits("abc")).isEqualTo("abc");
	}

	@Test
	public void example2() {
		assertThat(solution.clearDigits("cb34")).isEqualTo("");
	}
}
