package code.yakovenko.leetcode.easy;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

public final class ConvertDateToBinaryTest {

	private final ConvertDateToBinary solution = new ConvertDateToBinary();

	@Test
	public void example1() {
		assertThat(solution.convertDateToBinary("2080-02-29")).isEqualTo("100000100000-10-11101");
	}

	@Test
	public void example2() {
		assertThat(solution.convertDateToBinary("1900-01-01")).isEqualTo("11101101100-1-1");
	}
}
