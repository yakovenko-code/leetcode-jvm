package code.yakovenko.leetcode.java.easy;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

public final class ExcelSheetColumnNumberTest {

	private final ExcelSheetColumnNumber solution = new ExcelSheetColumnNumber();

	@Test
	public void example1() {
		assertThat(solution.titleToNumber("A")).isEqualTo(1);
	}

	@Test
	public void example2() {
		assertThat(solution.titleToNumber("AB")).isEqualTo(28);
	}

	@Test
	public void example3() {
		assertThat(solution.titleToNumber("ZY")).isEqualTo(701);
	}
}
