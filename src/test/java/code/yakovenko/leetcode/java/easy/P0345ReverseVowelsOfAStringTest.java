package code.yakovenko.leetcode.java.easy;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

public final class P0345ReverseVowelsOfAStringTest {

	private final P0345ReverseVowelsOfAString solution = new P0345ReverseVowelsOfAString();

	@Test
	public void example1() {
		assertThat(solution.reverseVowels("IceCreAm")).isEqualTo("AceCreIm");
	}

	@Test
	public void example2() {
		assertThat(solution.reverseVowels("leetcode")).isEqualTo("leotcede");
	}
}
