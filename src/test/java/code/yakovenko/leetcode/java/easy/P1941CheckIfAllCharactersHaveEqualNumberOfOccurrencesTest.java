package code.yakovenko.leetcode.java.easy;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

public final class P1941CheckIfAllCharactersHaveEqualNumberOfOccurrencesTest {

	private final P1941CheckIfAllCharactersHaveEqualNumberOfOccurrences solution =
			new P1941CheckIfAllCharactersHaveEqualNumberOfOccurrences();

	@Test
	public void example1() {
		assertThat(solution.areOccurrencesEqual("abacbc")).isTrue();
	}

	@Test
	public void example2() {
		assertThat(solution.areOccurrencesEqual("aaabb")).isFalse();
	}
}
