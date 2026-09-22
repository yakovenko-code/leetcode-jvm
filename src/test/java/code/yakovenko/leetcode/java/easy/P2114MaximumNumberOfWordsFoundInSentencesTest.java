package code.yakovenko.leetcode.java.easy;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

public final class P2114MaximumNumberOfWordsFoundInSentencesTest {

	private final P2114MaximumNumberOfWordsFoundInSentences solution = new P2114MaximumNumberOfWordsFoundInSentences();

	@Test
	public void example1() {
		assertThat(
				solution.mostWordsFound(
						new String[]{"alice and bob love leetcode", "i think so too", "this is great thanks very much"}
				)
		).isEqualTo(6);
	}

	@Test
	public void example2() {
		assertThat(
				solution.mostWordsFound(
						new String[]{"please wait", "continue to fight", "continue to win"}
				)
		).isEqualTo(3);
	}
}
