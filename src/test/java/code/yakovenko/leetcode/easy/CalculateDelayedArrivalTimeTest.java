package code.yakovenko.leetcode.easy;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

public final class CalculateDelayedArrivalTimeTest {

	private final CalculateDelayedArrivalTime solution = new CalculateDelayedArrivalTime();

	@Test
	public void example1() {
		assertThat(solution.findDelayedArrivalTime(15, 5)).isEqualTo(20);
	}

	@Test
	public void example2() {
		assertThat(solution.findDelayedArrivalTime(13, 11)).isEqualTo(0);
	}
}
