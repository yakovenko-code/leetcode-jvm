package code.yakovenko.leetcode.easy;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

public final class JewelsAndStonesTest {

	private final JewelsAndStones solution = new JewelsAndStones();

	@Test
	public void example1() {
		assertThat(solution.numJewelsInStones("aA", "aAAbbbb")).isEqualTo(3);
	}

	@Test
	public void example2() {
		assertThat(solution.numJewelsInStones("z", "ZZ")).isEqualTo(0);
	}
}
