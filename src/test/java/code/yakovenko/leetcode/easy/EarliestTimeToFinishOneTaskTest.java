package code.yakovenko.leetcode.easy;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

public final class EarliestTimeToFinishOneTaskTest {

	private final EarliestTimeToFinishOneTask solution = new EarliestTimeToFinishOneTask();

	@Test
	public void example1() {
		assertThat(solution.earliestTime(new int[][]{{1, 6}, {2, 3}})).isEqualTo(5);
	}

	@Test
	public void example2() {
		assertThat(solution.earliestTime(new int[][]{{100, 100}, {100, 100}, {100, 100}})).isEqualTo(200);
	}
}
