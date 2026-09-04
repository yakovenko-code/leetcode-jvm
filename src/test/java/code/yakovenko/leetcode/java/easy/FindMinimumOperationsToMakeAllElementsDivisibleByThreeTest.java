package code.yakovenko.leetcode.java.easy;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

public final class FindMinimumOperationsToMakeAllElementsDivisibleByThreeTest {

	private final FindMinimumOperationsToMakeAllElementsDivisibleByThree solution =
			new FindMinimumOperationsToMakeAllElementsDivisibleByThree();

	@Test
	public void example1() {
		assertThat(solution.minimumOperations(new int[]{1, 2, 3, 4})).isEqualTo(3);
	}

	@Test
	public void example2() {
		assertThat(solution.minimumOperations(new int[]{3, 6, 9})).isEqualTo(0);
	}
}
