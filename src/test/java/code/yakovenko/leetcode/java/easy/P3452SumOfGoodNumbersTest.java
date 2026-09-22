package code.yakovenko.leetcode.java.easy;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

public final class P3452SumOfGoodNumbersTest {

	private final P3452SumOfGoodNumbers solution = new P3452SumOfGoodNumbers();

	@Test
	public void example1() {
		assertThat(solution.sumOfGoodNumbers(new int[]{1, 3, 2, 1, 5, 4}, 2)).isEqualTo(12);
	}

	@Test
	public void example2() {
		assertThat(solution.sumOfGoodNumbers(new int[]{2, 1}, 1)).isEqualTo(2);
	}
}
