package code.yakovenko.leetcode.java.easy;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

public final class KeyboardRowTest {

	private final KeyboardRow solution = new KeyboardRow();

	@Test
	public void example1() {
		assertThat(solution.findWords(new String[]{"Hello", "Alaska", "Dad", "Peace"}))
				.isEqualTo(new String[]{"Alaska", "Dad"});
	}

	@Test
	public void example2() {
		assertThat(solution.findWords(new String[]{"omk"})).isEqualTo(new String[0]);
	}

	@Test
	public void example3() {
		assertThat(solution.findWords(new String[]{"adsdf", "sfd"})).isEqualTo(new String[]{"adsdf", "sfd"});
	}
}
