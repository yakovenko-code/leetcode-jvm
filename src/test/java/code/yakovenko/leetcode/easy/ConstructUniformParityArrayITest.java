package code.yakovenko.leetcode.easy;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

public final class ConstructUniformParityArrayITest {

	private final ConstructUniformParityArrayI solution = new ConstructUniformParityArrayI();

	@Test
	public void example1() {
		assertThat(solution.uniformArray(new int[]{2, 3})).isTrue();
	}

	@Test
	public void example2() {
		assertThat(solution.uniformArray(new int[]{4, 6})).isTrue();
	}
}
