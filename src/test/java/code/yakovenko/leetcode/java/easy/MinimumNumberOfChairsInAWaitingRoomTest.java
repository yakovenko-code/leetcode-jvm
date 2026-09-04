package code.yakovenko.leetcode.java.easy;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

public final class MinimumNumberOfChairsInAWaitingRoomTest {

	private final MinimumNumberOfChairsInAWaitingRoom solution = new MinimumNumberOfChairsInAWaitingRoom();

	@Test
	public void example1() {
		assertThat(solution.minimumChairs("EEEEEEE")).isEqualTo(7);
	}

	@Test
	public void example2() {
		assertThat(solution.minimumChairs("ELELEEL")).isEqualTo(2);
	}
}
