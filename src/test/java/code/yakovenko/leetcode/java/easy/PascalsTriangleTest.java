package code.yakovenko.leetcode.java.easy;

import org.junit.jupiter.api.Test;

import java.util.List;

import static org.assertj.core.api.Assertions.assertThat;

public final class PascalsTriangleTest {

	private final PascalsTriangle solution = new PascalsTriangle();

	@Test
	public void example1() {
		assertThat(solution.generate(5)).isEqualTo(
				List.of(
						List.of(1),
						List.of(1, 1),
						List.of(1, 2, 1),
						List.of(1, 3, 3, 1),
						List.of(1, 4, 6, 4, 1)
				)
		);
	}
}
