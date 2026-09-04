package code.yakovenko.leetcode.java.easy;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

public final class TheTwoSneakyNumbersOfDigitvilleTest {

	private final TheTwoSneakyNumbersOfDigitville solution = new TheTwoSneakyNumbersOfDigitville();

	@Test
	public void example1() {
		assertThat(solution.getSneakyNumbers(new int[]{0, 1, 1, 0}))
				.containsExactlyInAnyOrder(0, 1);
	}

	@Test
	public void example2() {
		assertThat(solution.getSneakyNumbers(new int[]{0, 3, 2, 1, 3, 2})).containsExactlyInAnyOrder(2, 3);
	}

	@Test
	public void example3() {
		assertThat(solution.getSneakyNumbers(new int[]{7, 1, 5, 4, 3, 4, 6, 0, 9, 5, 8, 2}))
				.containsExactlyInAnyOrder(4, 5);
	}
}
