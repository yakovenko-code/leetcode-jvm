package code.yakovenko.leetcode.easy;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

public final class RemoveTrailingZerosFromAStringTest {

	private final RemoveTrailingZerosFromAString solution = new RemoveTrailingZerosFromAString();

	@Test
	public void example1() {
		assertThat(solution.removeTrailingZeros("51230100")).isEqualTo("512301");
	}

	@Test
	public void example2() {
		assertThat(solution.removeTrailingZeros("123")).isEqualTo("123");
	}
}
