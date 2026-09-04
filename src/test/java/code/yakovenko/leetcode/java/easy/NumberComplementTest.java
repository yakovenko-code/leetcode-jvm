package code.yakovenko.leetcode.java.easy;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

public final class NumberComplementTest {

	private final NumberComplement solution = new NumberComplement();

	@Test
	public void example1() {
		assertThat(solution.findComplement(5)).isEqualTo(2);
	}

	@Test
	public void example2() {
		assertThat(solution.findComplement(1)).isEqualTo(0);
	}
}
