package code.yakovenko.leetcode.easy;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

public final class FirstMatchingCharacterFromBothEndsTest {

	private final FirstMatchingCharacterFromBothEnds solution = new FirstMatchingCharacterFromBothEnds();

	@Test
	public void test1() {
		assertThat(solution.firstMatchingIndex("abcacbd")).isEqualTo(1);
	}

	@Test
	public void test2() {
		assertThat(solution.firstMatchingIndex("abc")).isEqualTo(1);
	}

	@Test
	public void test3() {
		assertThat(solution.firstMatchingIndex("abcdab")).isEqualTo(-1);
	}
}
