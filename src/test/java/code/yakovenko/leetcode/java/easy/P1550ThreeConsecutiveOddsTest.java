package code.yakovenko.leetcode.java.easy;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

public final class P1550ThreeConsecutiveOddsTest {

	private final P1550ThreeConsecutiveOdds solution = new P1550ThreeConsecutiveOdds();

	@Test
	public void example1() {
		assertThat(solution.threeConsecutiveOdds(new int[]{2, 6, 4, 1})).isFalse();
	}

	@Test
	public void example2() {
		assertThat(solution.threeConsecutiveOdds(new int[]{1, 2, 34, 3, 4, 5, 7, 23, 12})).isTrue();
	}
}
