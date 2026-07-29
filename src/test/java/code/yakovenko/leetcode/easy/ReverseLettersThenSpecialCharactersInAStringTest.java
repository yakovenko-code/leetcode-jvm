package code.yakovenko.leetcode.easy;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

public final class ReverseLettersThenSpecialCharactersInAStringTest {

	private final ReverseLettersThenSpecialCharactersInAString solution =
			new ReverseLettersThenSpecialCharactersInAString();

	@Test
	public void test1() {
		assertThat(solution.reverseByType(")ebc#da@f(")).isEqualTo("(fad@cb#e)");
	}

	@Test
	public void test2() {
		assertThat(solution.reverseByType("z")).isEqualTo("z");
	}

	@Test
	public void test3() {
		assertThat(solution.reverseByType("!@#$%^&*()")).isEqualTo(")(*&^%$#@!");
	}
}
