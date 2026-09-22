package code.yakovenko.leetcode.java.easy;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

public final class P0028FindTheIndexOfTheFirstOccurrenceInAStringTest {

	private final P0028FindTheIndexOfTheFirstOccurrenceInAString solution = new P0028FindTheIndexOfTheFirstOccurrenceInAString();

	@Test
	public void example1() {
		assertThat(solution.strStr("sadbutsad", "sad")).isEqualTo(0);
	}

	@Test
	public void example2() {
		assertThat(solution.strStr("leetcode", "leeto")).isEqualTo(-1);
	}
}
