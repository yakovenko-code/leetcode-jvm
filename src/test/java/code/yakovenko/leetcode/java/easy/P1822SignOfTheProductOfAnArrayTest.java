package code.yakovenko.leetcode.java.easy;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

public final class P1822SignOfTheProductOfAnArrayTest {

	private final P1822SignOfTheProductOfAnArray solution = new P1822SignOfTheProductOfAnArray();

	@Test
	public void example1() {
		assertThat(solution.arraySign(new int[]{-1, -2, -3, -4, 3, 2, 1})).isEqualTo(1);
	}

	@Test
	public void example2() {
		assertThat(solution.arraySign(new int[]{1, 5, 0, 2, -3})).isEqualTo(0);
	}

	@Test
	public void example3() {
		assertThat(solution.arraySign(new int[]{-1, 1, -1, 1, -1})).isEqualTo(-1);
	}
}
