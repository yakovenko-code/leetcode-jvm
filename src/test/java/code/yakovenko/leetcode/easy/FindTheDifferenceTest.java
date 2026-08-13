package code.yakovenko.leetcode.easy;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

public final class FindTheDifferenceTest {

	private final FindTheDifference solution = new FindTheDifference();

	@Test
	public void test1() {
		assertThat(solution.findTheDifference("abcd", "abcde")).isEqualTo('e');
	}

	@Test
	public void test2() {
		assertThat(solution.findTheDifference("", "y")).isEqualTo('y');
	}
}
