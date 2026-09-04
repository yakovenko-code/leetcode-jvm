package code.yakovenko.leetcode.java.easy;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

public final class PalindromeNumberTest {

	private final PalindromeNumber solution = new PalindromeNumber();

	@Test
	public void example1() {
		assertThat(solution.isPalindrome(121)).isTrue();
	}

	@Test
	public void example2() {
		assertThat(solution.isPalindrome(-121)).isFalse();
	}

	@Test
	public void example3() {
		assertThat(solution.isPalindrome(10)).isFalse();
	}
}
