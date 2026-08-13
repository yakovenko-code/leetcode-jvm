package code.yakovenko.leetcode.easy;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

public final class ValidDigitNumberTest {

	private final ValidDigitNumber solution = new ValidDigitNumber();

	@Test
	public void example1() {
		assertThat(solution.validDigit(101, 0)).isTrue();
	}

	@Test
	public void example2() {
		assertThat(solution.validDigit(232, 2)).isFalse();
	}

	@Test
	public void example3() {
		assertThat(solution.validDigit(5, 1)).isFalse();
	}
}
