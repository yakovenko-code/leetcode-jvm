package code.yakovenko.leetcode.java.easy;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

public final class MinimumCommonValueTest {

	private final MinimumCommonValue solution = new MinimumCommonValue();

	@Test
	public void example1() {
		assertThat(solution.getCommon(new int[]{1, 2, 3}, new int[]{2, 4})).isEqualTo(2);
	}

	@Test
	public void example2() {
		assertThat(solution.getCommon(new int[]{1, 2, 3, 6}, new int[]{2, 3, 4, 5})).isEqualTo(2);
	}
}
