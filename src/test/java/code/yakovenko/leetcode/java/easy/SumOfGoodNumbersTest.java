package code.yakovenko.leetcode.java.easy;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

public final class SumOfGoodNumbersTest {

	private final SumOfGoodNumbers solution = new SumOfGoodNumbers();

	@Test
	public void example1() {
		assertThat(solution.sumOfGoodNumbers(new int[]{1, 3, 2, 1, 5, 4}, 2)).isEqualTo(12);
	}

	@Test
	public void example2() {
		assertThat(solution.sumOfGoodNumbers(new int[]{2, 1}, 1)).isEqualTo(2);
	}
}
