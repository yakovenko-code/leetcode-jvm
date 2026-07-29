package code.yakovenko.leetcode.easy;

import org.junit.jupiter.api.Test;

import java.util.List;

import static org.assertj.core.api.Assertions.assertThat;

public final class SnakeInMatrixTest {

	private final SnakeInMatrix solution = new SnakeInMatrix();

	@Test
	public void test1() {
		assertThat(solution.finalPositionOfSnake(2, List.of("RIGHT", "DOWN"))).isEqualTo(3);
	}

	@Test
	public void test2() {
		assertThat(solution.finalPositionOfSnake(3, List.of("DOWN", "RIGHT", "UP"))).isEqualTo(1);
	}
}
