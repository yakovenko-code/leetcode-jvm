package code.yakovenko.leetcode.java.easy;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

public final class ReverseVowelsOfAStringTest {

	private final ReverseVowelsOfAString solution = new ReverseVowelsOfAString();

	@Test
	public void example1() {
		assertThat(solution.reverseVowels("IceCreAm")).isEqualTo("AceCreIm");
	}

	@Test
	public void example2() {
		assertThat(solution.reverseVowels("leetcode")).isEqualTo("leotcede");
	}
}
