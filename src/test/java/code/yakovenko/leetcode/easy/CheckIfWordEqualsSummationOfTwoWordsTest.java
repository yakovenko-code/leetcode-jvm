package code.yakovenko.leetcode.easy;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

public final class CheckIfWordEqualsSummationOfTwoWordsTest {

	private final CheckIfWordEqualsSummationOfTwoWords solution = new CheckIfWordEqualsSummationOfTwoWords();

	@Test
	public void test1() {
		assertThat(solution.isSumEqual("acb", "cba", "cdb")).isTrue();
	}

	@Test
	public void test2() {
		assertThat(solution.isSumEqual("aaa", "a", "aab")).isFalse();
	}

	@Test
	public void test3() {
		assertThat(solution.isSumEqual("aaa", "a", "aaaa")).isTrue();
	}
}
