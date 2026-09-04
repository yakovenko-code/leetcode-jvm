package code.yakovenko.leetcode.java.easy;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

public final class SubtractTheProductAndSumOfDigitsOfAnIntegerTest {

	private final SubtractTheProductAndSumOfDigitsOfAnInteger solution =
			new SubtractTheProductAndSumOfDigitsOfAnInteger();

	@Test
	public void example1() {
		assertThat(solution.subtractProductAndSum(234)).isEqualTo(15);
	}

	@Test
	public void example2() {
		assertThat(solution.subtractProductAndSum(4421)).isEqualTo(21);
	}
}
