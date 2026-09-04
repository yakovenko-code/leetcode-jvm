package code.yakovenko.leetcode.java.easy;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

public final class CheckIfAllCharactersHaveEqualNumberOfOccurrencesTest {

	private final CheckIfAllCharactersHaveEqualNumberOfOccurrences solution =
			new CheckIfAllCharactersHaveEqualNumberOfOccurrences();

	@Test
	public void example1() {
		assertThat(solution.areOccurrencesEqual("abacbc")).isTrue();
	}

	@Test
	public void example2() {
		assertThat(solution.areOccurrencesEqual("aaabb")).isFalse();
	}
}
