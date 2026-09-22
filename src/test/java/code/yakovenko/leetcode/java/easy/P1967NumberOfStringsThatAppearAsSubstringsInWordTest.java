package code.yakovenko.leetcode.java.easy;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

public final class P1967NumberOfStringsThatAppearAsSubstringsInWordTest {

	private final P1967NumberOfStringsThatAppearAsSubstringsInWord solution =
			new P1967NumberOfStringsThatAppearAsSubstringsInWord();

	@Test
	public void example1() {
		assertThat(solution.numOfStrings(new String[]{"a", "abc", "bc", "d"}, "abc")).isEqualTo(3);
	}

	@Test
	public void example2() {
		assertThat(solution.numOfStrings(new String[]{"a", "b", "c"}, "aaaaabbbbb")).isEqualTo(2);
	}

	@Test
	public void example3() {
		assertThat(solution.numOfStrings(new String[]{"a", "a", "a"}, "ab")).isEqualTo(3);
	}
}
