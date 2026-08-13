package code.yakovenko.leetcode.easy;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

public final class BitwiseOROfEvenNumbersInAnArrayTest {

	private final BitwiseOROfEvenNumbersInAnArray solution = new BitwiseOROfEvenNumbersInAnArray();

	@Test
	public void example1() {
		assertThat(solution.evenNumberBitwiseORs(new int[]{1, 2, 3, 4, 5, 6})).isEqualTo(6);
	}

	@Test
	public void example2() {
		assertThat(solution.evenNumberBitwiseORs(new int[]{7, 9, 11})).isEqualTo(0);
	}

	@Test
	public void example3() {
		assertThat(solution.evenNumberBitwiseORs(new int[]{1, 8, 16})).isEqualTo(24);
	}
}
