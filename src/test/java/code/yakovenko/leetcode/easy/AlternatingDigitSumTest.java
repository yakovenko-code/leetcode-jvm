package code.yakovenko.leetcode.easy;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

public final class AlternatingDigitSumTest {

	private final AlternatingDigitSum solution = new AlternatingDigitSum();

	@Test
	public void test1() {
		assertThat(solution.alternateDigitSum(521)).isEqualTo(4);
	}

	@Test
	public void test2() {
		assertThat(solution.alternateDigitSum(111)).isEqualTo(1);
	}

	@Test
	public void test3() {
		assertThat(solution.alternateDigitSum(886996)).isEqualTo(0);
	}
}
