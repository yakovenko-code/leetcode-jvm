package code.yakovenko.leetcode.java.easy;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

public final class P2710RemoveTrailingZerosFromAStringTest {

	private final P2710RemoveTrailingZerosFromAString solution = new P2710RemoveTrailingZerosFromAString();

	@Test
	public void example1() {
		assertThat(solution.removeTrailingZeros("51230100")).isEqualTo("512301");
	}

	@Test
	public void example2() {
		assertThat(solution.removeTrailingZeros("123")).isEqualTo("123");
	}
}
