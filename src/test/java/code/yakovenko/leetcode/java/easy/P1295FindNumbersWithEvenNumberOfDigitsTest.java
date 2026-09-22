package code.yakovenko.leetcode.java.easy;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

public final class P1295FindNumbersWithEvenNumberOfDigitsTest {

	private final P1295FindNumbersWithEvenNumberOfDigits solution = new P1295FindNumbersWithEvenNumberOfDigits();

	@Test
	public void example1() {
		assertThat(solution.findNumbers(new int[]{12, 345, 2, 6, 7896})).isEqualTo(2);
	}

	@Test
	public void example2() {
		assertThat(solution.findNumbers(new int[]{555, 901, 482, 1771})).isEqualTo(1);
	}
}
