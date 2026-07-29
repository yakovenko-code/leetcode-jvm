package code.yakovenko.leetcode.easy;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

public final class UniqueMorseCodeWordsTest {

	private final UniqueMorseCodeWords solution = new UniqueMorseCodeWords();

	@Test
	public void test1() {
		assertThat(solution.uniqueMorseRepresentations(new String[]{"gin", "zen", "gig", "msg"})).isEqualTo(2);
	}

	@Test
	public void test2() {
		assertThat(solution.uniqueMorseRepresentations(new String[]{"a"})).isEqualTo(1);
	}
}
