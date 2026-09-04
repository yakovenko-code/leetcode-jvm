package code.yakovenko.leetcode.java.easy;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

public final class CountingWordsWithAGivenPrefixTest {

	private final CountingWordsWithAGivenPrefix solution = new CountingWordsWithAGivenPrefix();

	@Test
	public void example1() {
		assertThat(solution.prefixCount(new String[]{"pay", "attention", "practice", "attend"}, "at"))
				.isEqualTo(2);
	}

	@Test
	public void example2() {
		assertThat(solution.prefixCount(new String[]{"leetcode", "win", "loops", "success"}, "code"))
				.isEqualTo(0);
	}
}
