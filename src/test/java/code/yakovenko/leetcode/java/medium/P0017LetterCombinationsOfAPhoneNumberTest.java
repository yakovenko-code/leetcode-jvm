package code.yakovenko.leetcode.java.medium;

import org.junit.jupiter.api.Test;

import java.util.List;

import static org.assertj.core.api.Assertions.assertThat;

public final class P0017LetterCombinationsOfAPhoneNumberTest {

	private final P0017LetterCombinationsOfAPhoneNumber solution = new P0017LetterCombinationsOfAPhoneNumber();

	@Test
	public void example1() {
		assertThat(solution.letterCombinations("23"))
				.isEqualTo(List.of("ad", "ae", "af", "bd", "be", "bf", "cd", "ce", "cf"));
	}

	@Test
	public void example2() {
		assertThat(solution.letterCombinations("2")).isEqualTo(List.of("a", "b", "c"));
	}
}
