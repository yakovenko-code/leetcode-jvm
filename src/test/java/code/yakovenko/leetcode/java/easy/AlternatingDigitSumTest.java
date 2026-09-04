package code.yakovenko.leetcode.java.easy;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

public final class AlternatingDigitSumTest {

	private final AlternatingDigitSum solution = new AlternatingDigitSum();

	@Test
	public void example1() {
		assertThat(solution.alternateDigitSum(521)).isEqualTo(4);
	}

	@Test
	public void example2() {
		assertThat(solution.alternateDigitSum(111)).isEqualTo(1);
	}

	@Test
	public void example3() {
		assertThat(solution.alternateDigitSum(886996)).isEqualTo(0);
	}
}
