package code.yakovenko.leetcode.java.easy;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

public final class P2351FirstLetterToAppearTwiceTest {

	private final P2351FirstLetterToAppearTwice solution = new P2351FirstLetterToAppearTwice();

	@Test
	public void example1() {
		assertThat(solution.repeatedCharacter("abccbaacz")).isEqualTo('c');
	}

	@Test
	public void example2() {
		assertThat(solution.repeatedCharacter("abcdd")).isEqualTo('d');
	}
}
