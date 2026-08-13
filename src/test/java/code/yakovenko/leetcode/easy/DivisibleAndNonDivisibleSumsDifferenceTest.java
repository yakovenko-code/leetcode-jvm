package code.yakovenko.leetcode.easy;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

public final class DivisibleAndNonDivisibleSumsDifferenceTest {

	private final DivisibleAndNonDivisibleSumsDifference solution = new DivisibleAndNonDivisibleSumsDifference();

	@Test
	public void example1() {
		assertThat(solution.differenceOfSums(10, 3)).isEqualTo(19);
	}

	@Test
	public void example2() {
		assertThat(solution.differenceOfSums(5, 6)).isEqualTo(15);
	}

	@Test
	public void example3() {
		assertThat(solution.differenceOfSums(5, 1)).isEqualTo(-15);
	}
}
