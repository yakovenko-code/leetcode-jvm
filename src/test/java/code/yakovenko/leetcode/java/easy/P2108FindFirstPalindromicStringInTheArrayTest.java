package code.yakovenko.leetcode.java.easy;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

public final class P2108FindFirstPalindromicStringInTheArrayTest {

	private final P2108FindFirstPalindromicStringInTheArray solution = new P2108FindFirstPalindromicStringInTheArray();

	@Test
	public void example1() {
		assertThat(solution.firstPalindrome(new String[]{"abc", "car", "ada", "racecar", "cool"})).isEqualTo("ada");
	}

	@Test
	public void example2() {
		assertThat(solution.firstPalindrome(new String[]{"notapalindrome", "racecar"})).isEqualTo("racecar");
	}

	@Test
	public void example3() {
		assertThat(solution.firstPalindrome(new String[]{"def", "ghi"})).isEqualTo("");
	}
}
