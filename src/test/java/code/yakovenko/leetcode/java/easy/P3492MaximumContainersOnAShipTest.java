package code.yakovenko.leetcode.java.easy;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

public final class P3492MaximumContainersOnAShipTest {

	private final P3492MaximumContainersOnAShip solution = new P3492MaximumContainersOnAShip();

	@Test
	public void example1() {
		assertThat(solution.maxContainers(2, 3, 15)).isEqualTo(4);
	}

	@Test
	public void example2() {
		assertThat(solution.maxContainers(3, 5, 20)).isEqualTo(4);
	}
}
