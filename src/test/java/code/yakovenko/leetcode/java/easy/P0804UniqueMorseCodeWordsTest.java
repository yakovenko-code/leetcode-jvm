package code.yakovenko.leetcode.java.easy;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

public final class P0804UniqueMorseCodeWordsTest {

	private final P0804UniqueMorseCodeWords solution = new P0804UniqueMorseCodeWords();

	@Test
	public void example1() {
		assertThat(solution.uniqueMorseRepresentations(new String[]{"gin", "zen", "gig", "msg"})).isEqualTo(2);
	}

	@Test
	public void example2() {
		assertThat(solution.uniqueMorseRepresentations(new String[]{"a"})).isEqualTo(1);
	}
}
