package code.yakovenko.leetcode.java.easy;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

public final class P3379TransformedArrayTest {

	private final P3379TransformedArray solution = new P3379TransformedArray();

	@Test
	public void example1() {
		assertThat(solution.constructTransformedArray(new int[]{3, -2, 1, 1})).isEqualTo(new int[]{1, 1, 1, 3});
	}

	@Test
	public void example2() {
		assertThat(solution.constructTransformedArray(new int[]{-1, 4, -1})).isEqualTo(new int[]{-1, -1, 4});
	}
}
