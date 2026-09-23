package code.yakovenko.leetcode.java.easy;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

public final class P4020ElevatorRequestsITest {

	private final P4020ElevatorRequestsI solution = new P4020ElevatorRequestsI();

	@Test
	public void example1() {
		assertThat(solution.elevatorRequests(5, new int[]{2, 1, 4, 3})).isEqualTo(7);
	}

	@Test
	public void example3() {
		assertThat(solution.elevatorRequests(3, new int[]{2, 0, 0})).isEqualTo(4);
	}
}
