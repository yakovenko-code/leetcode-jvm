package code.yakovenko.leetcode.java.easy;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

public final class P0771JewelsAndStonesTest {

	private final P0771JewelsAndStones solution = new P0771JewelsAndStones();

	@Test
	public void example1() {
		assertThat(solution.numJewelsInStones("aA", "aAAbbbb")).isEqualTo(3);
	}

	@Test
	public void example2() {
		assertThat(solution.numJewelsInStones("z", "ZZ")).isEqualTo(0);
	}
}
