package code.yakovenko.leetcode.java.easy;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

public final class P3884FirstMatchingCharacterFromBothEndsTest {

	private final P3884FirstMatchingCharacterFromBothEnds solution = new P3884FirstMatchingCharacterFromBothEnds();

	@Test
	public void example1() {
		assertThat(solution.firstMatchingIndex("abcacbd")).isEqualTo(1);
	}

	@Test
	public void example2() {
		assertThat(solution.firstMatchingIndex("abc")).isEqualTo(1);
	}

	@Test
	public void example3() {
		assertThat(solution.firstMatchingIndex("abcdab")).isEqualTo(-1);
	}
}
