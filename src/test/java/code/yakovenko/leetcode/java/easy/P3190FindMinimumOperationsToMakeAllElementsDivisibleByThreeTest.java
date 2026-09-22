package code.yakovenko.leetcode.java.easy;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

public final class P3190FindMinimumOperationsToMakeAllElementsDivisibleByThreeTest {

	private final P3190FindMinimumOperationsToMakeAllElementsDivisibleByThree solution =
			new P3190FindMinimumOperationsToMakeAllElementsDivisibleByThree();

	@Test
	public void example1() {
		assertThat(solution.minimumOperations(new int[]{1, 2, 3, 4})).isEqualTo(3);
	}

	@Test
	public void example2() {
		assertThat(solution.minimumOperations(new int[]{3, 6, 9})).isEqualTo(0);
	}
}
