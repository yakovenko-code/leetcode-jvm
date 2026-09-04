package code.yakovenko.leetcode.java.easy;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

public final class CheckIfNumberHasEqualDigitCountAndDigitValueTest {

	private final CheckIfNumberHasEqualDigitCountAndDigitValue solution =
			new CheckIfNumberHasEqualDigitCountAndDigitValue();

	@Test
	public void example1() {
		assertThat(solution.digitCount("1210")).isTrue();
	}

	@Test
	public void example2() {
		assertThat(solution.digitCount("030")).isFalse();
	}
}
