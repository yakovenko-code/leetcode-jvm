package code.yakovenko.leetcode.java.easy;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

public final class HarshadNumberTest {

	private final HarshadNumber solution = new HarshadNumber();

	@Test
	public void example1() {
		assertThat(solution.sumOfTheDigitsOfHarshadNumber(18)).isEqualTo(9);
	}

	@Test
	public void example2() {
		assertThat(solution.sumOfTheDigitsOfHarshadNumber(23)).isEqualTo(-1);
	}
}
