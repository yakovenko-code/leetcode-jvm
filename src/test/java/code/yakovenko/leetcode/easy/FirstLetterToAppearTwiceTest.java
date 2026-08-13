package code.yakovenko.leetcode.easy;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

public final class FirstLetterToAppearTwiceTest {

	private final FirstLetterToAppearTwice solution = new FirstLetterToAppearTwice();

	@Test
	public void example1() {
		assertThat(solution.repeatedCharacter("abccbaacz")).isEqualTo('c');
	}

	@Test
	public void example2() {
		assertThat(solution.repeatedCharacter("abcdd")).isEqualTo('d');
	}
}
