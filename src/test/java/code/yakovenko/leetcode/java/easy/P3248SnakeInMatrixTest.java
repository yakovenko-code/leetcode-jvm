package code.yakovenko.leetcode.java.easy;

import org.junit.jupiter.api.Test;

import java.util.List;

import static org.assertj.core.api.Assertions.assertThat;

public final class P3248SnakeInMatrixTest {

	private final P3248SnakeInMatrix solution = new P3248SnakeInMatrix();

	@Test
	public void example1() {
		assertThat(solution.finalPositionOfSnake(2, List.of("RIGHT", "DOWN"))).isEqualTo(3);
	}

	@Test
	public void example2() {
		assertThat(solution.finalPositionOfSnake(3, List.of("DOWN", "RIGHT", "UP"))).isEqualTo(1);
	}
}
