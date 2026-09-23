package code.yakovenko.leetcode.java.medium;

import org.junit.jupiter.api.Test;

import java.util.List;

import static org.assertj.core.api.Assertions.assertThat;

public final class P0049GroupAnagramsTest {

	private final P0049GroupAnagrams solution = new P0049GroupAnagrams();

	@Test
	public void example1() {
		assertThat(solution.groupAnagrams(new String[]{"eat", "tea", "tan", "ate", "nat", "bat"}))
				.isEqualTo(List.of(List.of("eat", "tea", "ate"), List.of("bat"), List.of("tan", "nat")));
	}

	@Test
	public void example2() {
		assertThat(solution.groupAnagrams(new String[]{""})).isEqualTo(List.of(List.of("")));
	}

	@Test
	public void example3() {
		assertThat(solution.groupAnagrams(new String[]{"a"})).isEqualTo(List.of(List.of("a")));
	}
}
