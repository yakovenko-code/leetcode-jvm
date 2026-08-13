package code.yakovenko.leetcode.easy;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

public final class TransformArrayByParityTest {

	private final TransformArrayByParity solution = new TransformArrayByParity();

	@Test
	public void example1() {
		assertThat(solution.transformArray(new int[]{4, 3, 2, 1})).isEqualTo(new int[]{0, 0, 1, 1});
	}

	@Test
	public void example2() {
		assertThat(solution.transformArray(new int[]{1, 5, 1, 4, 2})).isEqualTo(new int[]{0, 0, 1, 1, 1});
	}
}
