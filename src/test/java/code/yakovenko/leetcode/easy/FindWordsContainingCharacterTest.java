package code.yakovenko.leetcode.easy;

import org.junit.jupiter.api.Test;

import java.util.Collections;
import java.util.List;

import static org.assertj.core.api.Assertions.assertThat;

public final class FindWordsContainingCharacterTest {

	private final FindWordsContainingCharacter solution = new FindWordsContainingCharacter();

	@Test
	public void example1() {
		assertThat(solution.findWordsContaining(new String[]{"leet", "code"}, 'e')).isEqualTo(List.of(0, 1));
	}

	@Test
	public void example2() {
		assertThat(solution.findWordsContaining(new String[]{"abc", "bcd", "aaaa", "cbc"}, 'a'))
				.isEqualTo(List.of(0, 2));
	}

	@Test
	public void example3() {
		assertThat(solution.findWordsContaining(new String[]{"abc", "bcd", "aaaa", "cbc"}, 'z'))
				.isEqualTo(Collections.EMPTY_LIST);
	}
}
