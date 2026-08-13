package code.yakovenko.leetcode.easy;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

public final class NumberOfStringsThatAppearAsSubstringsInWordTest {

	private final NumberOfStringsThatAppearAsSubstringsInWord solution =
			new NumberOfStringsThatAppearAsSubstringsInWord();

	@Test
	public void test1() {
		assertThat(solution.numOfStrings(new String[]{"a", "abc", "bc", "d"}, "abc")).isEqualTo(3);
	}

	@Test
	public void test2() {
		assertThat(solution.numOfStrings(new String[]{"a", "b", "c"}, "aaaaabbbbb")).isEqualTo(2);
	}

	@Test
	public void test3() {
		assertThat(solution.numOfStrings(new String[]{"a", "a", "a"}, "ab")).isEqualTo(3);
	}
}
