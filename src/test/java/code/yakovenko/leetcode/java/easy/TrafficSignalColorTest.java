package code.yakovenko.leetcode.java.easy;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

public final class TrafficSignalColorTest {

	private final TrafficSignalColor solution = new TrafficSignalColor();

	@Test
	public void example1() {
		assertThat(solution.trafficSignal(60)).isEqualTo("Red");
	}

	@Test
	public void example2() {
		assertThat(solution.trafficSignal(5)).isEqualTo("Invalid");
	}
}
