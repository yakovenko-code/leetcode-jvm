package code.yakovenko.leetcode.easy;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

public class SmallestNumberWithAllSetBitsTest {

	private final SmallestNumberWithAllSetBits solution = new SmallestNumberWithAllSetBits();

	@Test
	public void test1() {
		assertThat(solution.smallestNumber(5)).isEqualTo(7);
	}

	@Test
	public void test2() {
		assertThat(solution.smallestNumber(10)).isEqualTo(15);
	}

	@Test
	public void test3() {
		assertThat(solution.smallestNumber(3)).isEqualTo(3);
	}
}
