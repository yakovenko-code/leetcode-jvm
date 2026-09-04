package code.yakovenko.leetcode.java.easy;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

public final class LengthOfLastWordTest {

	private final LengthOfLastWord solution = new LengthOfLastWord();

	@Test
	public void example1() {
		assertThat(solution.lengthOfLastWord("Hello World")).isEqualTo(5);
	}

	@Test
	public void example2() {
		assertThat(solution.lengthOfLastWord("   fly me   to   the moon  ")).isEqualTo(4);
	}

	@Test
	public void example3() {
		assertThat(solution.lengthOfLastWord("luffy is still joyboy")).isEqualTo(6);
	}
}
