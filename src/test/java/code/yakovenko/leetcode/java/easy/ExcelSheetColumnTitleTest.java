package code.yakovenko.leetcode.java.easy;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

public final class ExcelSheetColumnTitleTest {

	private final ExcelSheetColumnTitle solution = new ExcelSheetColumnTitle();

	@Test
	public void example1() {
		assertThat(solution.convertToTitle(1)).isEqualTo("A");
	}

	@Test
	public void example2() {
		assertThat(solution.convertToTitle(28)).isEqualTo("AB");
	}

	@Test
	public void example3() {
		assertThat(solution.convertToTitle(701)).isEqualTo("ZY");
	}
}
