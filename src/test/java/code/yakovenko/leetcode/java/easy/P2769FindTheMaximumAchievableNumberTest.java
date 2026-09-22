package code.yakovenko.leetcode.java.easy;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

public final class P2769FindTheMaximumAchievableNumberTest {

	private final P2769FindTheMaximumAchievableNumber solution = new P2769FindTheMaximumAchievableNumber();

	@Test
	public void example1() {
		assertThat(solution.theMaximumAchievableX(4, 1)).isEqualTo(6);
	}

	@Test
	public void example2() {
		assertThat(solution.theMaximumAchievableX(3, 2)).isEqualTo(7);
	}
}
