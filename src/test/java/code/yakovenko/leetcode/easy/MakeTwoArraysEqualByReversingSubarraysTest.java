package code.yakovenko.leetcode.easy;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

public final class MakeTwoArraysEqualByReversingSubarraysTest {

	private final MakeTwoArraysEqualByReversingSubarrays solution = new MakeTwoArraysEqualByReversingSubarrays();

	@Test
	public void example1() {
		assertThat(solution.canBeEqual(new int[]{1, 2, 3, 4}, new int[]{2, 4, 1, 3})).isTrue();
	}

	@Test
	public void example2() {
		assertThat(solution.canBeEqual(new int[]{7}, new int[]{7})).isTrue();
	}

	@Test
	public void example3() {
		assertThat(solution.canBeEqual(new int[]{3, 7, 9}, new int[]{3, 7, 11})).isFalse();
	}
}
