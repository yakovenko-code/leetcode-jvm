package code.yakovenko.leetcode.java.easy;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

public final class P3823ReverseLettersThenSpecialCharactersInAStringTest {

	private final P3823ReverseLettersThenSpecialCharactersInAString solution =
			new P3823ReverseLettersThenSpecialCharactersInAString();

	@Test
	public void example1() {
		assertThat(solution.reverseByType(")ebc#da@f(")).isEqualTo("(fad@cb#e)");
	}

	@Test
	public void example2() {
		assertThat(solution.reverseByType("z")).isEqualTo("z");
	}

	@Test
	public void example3() {
		assertThat(solution.reverseByType("!@#$%^&*()")).isEqualTo(")(*&^%$#@!");
	}
}
