package code.yakovenko.leetcode.java.easy;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

public final class P0242ValidAnagramTest {

	private final P0242ValidAnagram solution = new P0242ValidAnagram();

	@Test
	public void example1() {
		assertThat(solution.isAnagram("anagram", "nagaram")).isTrue();
	}

	@Test
	public void example2() {
		assertThat(solution.isAnagram("rat", "car")).isFalse();
	}
}
