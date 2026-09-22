package code.yakovenko.leetcode.java.easy;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

public final class P1009ComplementOfBase10IntegerTest {

	private final P1009ComplementOfBase10Integer solution = new P1009ComplementOfBase10Integer();

	@Test
	public void example1() {
		assertThat(solution.bitwiseComplement(5)).isEqualTo(2);
	}

	@Test
	public void example2() {
		assertThat(solution.bitwiseComplement(7)).isEqualTo(0);
	}

	@Test
	public void example3() {
		assertThat(solution.bitwiseComplement(10)).isEqualTo(5);
	}
}
