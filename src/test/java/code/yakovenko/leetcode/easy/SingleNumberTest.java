package code.yakovenko.leetcode.easy;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

public final class SingleNumberTest {

	private final SingleNumber solution = new SingleNumber();

	@Test
	public void test1() {
		assertThat(solution.singleNumber(new int[]{2, 2, 1})).isEqualTo(1);
	}

	@Test
	public void test2() {
		assertThat(solution.singleNumber(new int[]{4, 1, 2, 1, 2})).isEqualTo(4);
	}

	@Test
	public void test3() {
		assertThat(solution.singleNumber(new int[]{1})).isEqualTo(1);
	}
}
