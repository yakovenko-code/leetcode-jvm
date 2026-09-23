package code.yakovenko.leetcode.java.easy;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

public final class P1859SortingTheSentenceTest {

	private final P1859SortingTheSentence solution = new P1859SortingTheSentence();

	@Test
	public void example1() {
		assertThat(solution.sortSentence("is2 sentence4 This1 a3")).isEqualTo("This is a sentence");
	}

	@Test
	public void example2() {
		assertThat(solution.sortSentence("Myself2 Me1 I4 and3")).isEqualTo("Me Myself and I");
	}
}
