package code.yakovenko.leetcode.java.easy;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

public final class ReverseStringPrefixTest {

	private final ReverseStringPrefix solution = new ReverseStringPrefix();

	@Test
	public void example1() {
		assertThat(solution.reversePrefix("abcd", 2)).isEqualTo("bacd");
	}

	@Test
	public void example2() {
		assertThat(solution.reversePrefix("xyz", 3)).isEqualTo("zyx");
	}

	@Test
	public void example3() {
		assertThat(solution.reversePrefix("hey", 1)).isEqualTo("hey");
	}
}
