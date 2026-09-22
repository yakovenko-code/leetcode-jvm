package code.yakovenko.leetcode.java.easy;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

public final class P2520CountTheDigitsThatDivideANumberTest {

	private final P2520CountTheDigitsThatDivideANumber solution = new P2520CountTheDigitsThatDivideANumber();

	@Test
	public void example1() {
		assertThat(solution.countDigits(7)).isEqualTo(1);
	}

	@Test
	public void example2() {
		assertThat(solution.countDigits(121)).isEqualTo(2);
	}

	@Test
	public void example3() {
		assertThat(solution.countDigits(1248)).isEqualTo(4);
	}
}
