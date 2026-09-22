package code.yakovenko.leetcode.java.easy;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

public final class P1880CheckIfWordEqualsSummationOfTwoWordsTest {

	private final P1880CheckIfWordEqualsSummationOfTwoWords solution = new P1880CheckIfWordEqualsSummationOfTwoWords();

	@Test
	public void example1() {
		assertThat(solution.isSumEqual("acb", "cba", "cdb")).isTrue();
	}

	@Test
	public void example2() {
		assertThat(solution.isSumEqual("aaa", "a", "aab")).isFalse();
	}

	@Test
	public void example3() {
		assertThat(solution.isSumEqual("aaa", "a", "aaaa")).isTrue();
	}
}
