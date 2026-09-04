package code.yakovenko.leetcode.java.easy;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

public final class ValidAnagramTest {

	private final ValidAnagram solution = new ValidAnagram();

	@Test
	public void example1() {
		assertThat(solution.isAnagram("anagram", "nagaram")).isTrue();
	}

	@Test
	public void example2() {
		assertThat(solution.isAnagram("rat", "car")).isFalse();
	}
}
