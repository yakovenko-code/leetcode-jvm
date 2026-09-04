package code.yakovenko.leetcode.java.easy;

import org.junit.jupiter.api.Test;

import java.util.List;

import static org.assertj.core.api.Assertions.assertThat;

public final class CheckIfAStringIsAnAcronymOfWordsTest {

	private final CheckIfAStringIsAnAcronymOfWords solution = new CheckIfAStringIsAnAcronymOfWords();

	@Test
	public void example1() {
		assertThat(solution.isAcronym(List.of("alice", "bob", "charlie"), "abc")).isTrue();
	}

	@Test
	public void example2() {
		assertThat(solution.isAcronym(List.of("an", "apple"), "a")).isFalse();
	}

	@Test
	public void example3() {
		assertThat(solution.isAcronym(List.of("never", "gonna", "give", "up", "on", "you"), "ngguoy")).isTrue();
	}
}
