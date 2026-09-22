package code.yakovenko.leetcode.java.easy;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

public final class P2535DifferenceBetweenElementSumAndDigitSumOfAnArrayTest {

	private final P2535DifferenceBetweenElementSumAndDigitSumOfAnArray solution =
			new P2535DifferenceBetweenElementSumAndDigitSumOfAnArray();

	@Test
	public void example1() {
		assertThat(solution.differenceOfSum(new int[]{1, 15, 6, 3})).isEqualTo(9);
	}

	@Test
	public void example2() {
		assertThat(solution.differenceOfSum(new int[]{1, 2, 3, 4})).isEqualTo(0);
	}
}
