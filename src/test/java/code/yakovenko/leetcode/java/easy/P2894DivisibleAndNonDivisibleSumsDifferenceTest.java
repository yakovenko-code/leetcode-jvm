package code.yakovenko.leetcode.java.easy;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

public final class P2894DivisibleAndNonDivisibleSumsDifferenceTest {

	private final P2894DivisibleAndNonDivisibleSumsDifference solution = new P2894DivisibleAndNonDivisibleSumsDifference();

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
