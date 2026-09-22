package code.yakovenko.leetcode.java.easy;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

public final class P0405ConvertANumberToHexadecimalTest {

	private final P0405ConvertANumberToHexadecimal solution = new P0405ConvertANumberToHexadecimal();

	@Test
	public void example1() {
		assertThat(solution.toHex(26)).isEqualTo("1a");
	}

	@Test
	public void example2() {
		assertThat(solution.toHex(-1)).isEqualTo("ffffffff");
	}
}
