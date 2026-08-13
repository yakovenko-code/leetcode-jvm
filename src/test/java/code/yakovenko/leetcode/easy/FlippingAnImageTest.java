package code.yakovenko.leetcode.easy;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

public final class FlippingAnImageTest {

	private final FlippingAnImage solution = new FlippingAnImage();

	@Test
	public void example1() {
		assertThat(solution.flipAndInvertImage(new int[][]{{1, 1, 0}, {1, 0, 1}, {0, 0, 0}}))
				.isEqualTo(new int[][]{{1, 0, 0}, {0, 1, 0}, {1, 1, 1}});
	}

	@Test
	public void example2() {
		assertThat(solution.flipAndInvertImage(new int[][]{{1, 1, 0, 0}, {1, 0, 0, 1}, {0, 1, 1, 1}, {1, 0, 1, 0}}))
				.isEqualTo(new int[][]{{1, 1, 0, 0}, {0, 1, 1, 0}, {0, 0, 0, 1}, {1, 0, 1, 0}});
	}
}
