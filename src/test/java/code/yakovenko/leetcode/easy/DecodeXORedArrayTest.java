package code.yakovenko.leetcode.easy;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

public final class DecodeXORedArrayTest {

	private final DecodeXORedArray solution = new DecodeXORedArray();

	@Test
	public void test1() {
		assertThat(solution.decode(new int[]{1, 2, 3}, 1)).isEqualTo(new int[]{1, 0, 2, 1});
	}

	@Test
	public void test2() {
		assertThat(solution.decode(new int[]{6, 2, 7, 3}, 4)).isEqualTo(new int[]{4, 2, 0, 7, 4});
	}
}
