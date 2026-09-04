package code.yakovenko.leetcode.java.easy;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

public final class ValidPalindromeTest {

	private final ValidPalindrome solution = new ValidPalindrome();

	@Test
	public void example1() {
		assertThat(solution.isPalindrome("A man, a plan, a canal: Panama")).isTrue();
	}

	@Test
	public void example2() {
		assertThat(solution.isPalindrome("race a car")).isFalse();
	}

	@Test
	public void example3() {
		assertThat(solution.isPalindrome(" ")).isTrue();
	}
}
