package code.yakovenko.leetcode.java.easy;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

public final class FindTheDifferenceTest {

	private final FindTheDifference solution = new FindTheDifference();

	@Test
	public void example1() {
		assertThat(solution.findTheDifference("abcd", "abcde")).isEqualTo('e');
	}

	@Test
	public void example2() {
		assertThat(solution.findTheDifference("", "y")).isEqualTo('y');
	}
}
