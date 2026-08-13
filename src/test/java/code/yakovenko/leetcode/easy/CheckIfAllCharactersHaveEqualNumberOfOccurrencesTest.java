package code.yakovenko.leetcode.easy;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

public final class CheckIfAllCharactersHaveEqualNumberOfOccurrencesTest {

	private final CheckIfAllCharactersHaveEqualNumberOfOccurrences solution =
			new CheckIfAllCharactersHaveEqualNumberOfOccurrences();

	@Test
	public void test1() {
		assertThat(solution.areOccurrencesEqual("abacbc")).isTrue();
	}

	@Test
	public void test2() {
		assertThat(solution.areOccurrencesEqual("aaabb")).isFalse();
	}
}
