package code.yakovenko.leetcode.java.easy;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

public final class P1281SubtractTheProductAndSumOfDigitsOfAnIntegerTest {

	private final P1281SubtractTheProductAndSumOfDigitsOfAnInteger solution =
			new P1281SubtractTheProductAndSumOfDigitsOfAnInteger();

	@Test
	public void example1() {
		assertThat(solution.subtractProductAndSum(234)).isEqualTo(15);
	}

	@Test
	public void example2() {
		assertThat(solution.subtractProductAndSum(4421)).isEqualTo(21);
	}
}
