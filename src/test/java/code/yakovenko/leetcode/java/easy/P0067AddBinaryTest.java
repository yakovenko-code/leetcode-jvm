package code.yakovenko.leetcode.java.easy;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

public final class P0067AddBinaryTest {

	private final P0067AddBinary solution = new P0067AddBinary();

	@Test
	public void example1() {
		assertThat(solution.addBinary("11", "1")).isEqualTo("100");
	}

	@Test
	public void example2() {
		assertThat(solution.addBinary("1010", "1011")).isEqualTo("10101");
	}
}
