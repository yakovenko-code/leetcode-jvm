package code.yakovenko.leetcode.java.easy;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

public final class P0383RansomNoteTest {

	private final P0383RansomNote solution = new P0383RansomNote();

	@Test
	public void example1() {
		assertThat(solution.canConstruct("a", "b")).isFalse();
	}

	@Test
	public void example2() {
		assertThat(solution.canConstruct("aa", "ab")).isFalse();
	}

	@Test
	public void example3() {
		assertThat(solution.canConstruct("aa", "aab")).isTrue();
	}
}
