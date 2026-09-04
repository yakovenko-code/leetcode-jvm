package code.yakovenko.leetcode.java.easy;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

public final class ReversePrefixOfWordTest {

	private final ReversePrefixOfWord solution = new ReversePrefixOfWord();

	@Test
	public void example1() {
		assertThat(solution.reversePrefix("abcdefd", 'd')).isEqualTo("dcbaefd");
	}

	@Test
	public void example2() {
		assertThat(solution.reversePrefix("xyxzxe", 'z')).isEqualTo("zxyxxe");
	}

	@Test
	public void example3() {
		assertThat(solution.reversePrefix("abcd", 'z')).isEqualTo("abcd");
	}

}
