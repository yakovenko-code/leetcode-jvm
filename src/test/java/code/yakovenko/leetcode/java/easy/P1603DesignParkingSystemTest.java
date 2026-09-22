package code.yakovenko.leetcode.java.easy;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

public final class P1603DesignParkingSystemTest {

	@Test
	public void example1() {
		final P1603DesignParkingSystem solution = new P1603DesignParkingSystem(1, 1, 0);

		assertThat(solution.addCar(1)).isTrue();
		assertThat(solution.addCar(2)).isTrue();
		assertThat(solution.addCar(3)).isFalse();
		assertThat(solution.addCar(1)).isFalse();
	}
}
