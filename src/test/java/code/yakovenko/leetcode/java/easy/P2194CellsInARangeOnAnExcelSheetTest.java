package code.yakovenko.leetcode.java.easy;

import org.junit.jupiter.api.Test;

import java.util.List;

import static org.assertj.core.api.Assertions.assertThat;

public final class P2194CellsInARangeOnAnExcelSheetTest {

	private final P2194CellsInARangeOnAnExcelSheet solution = new P2194CellsInARangeOnAnExcelSheet();

	@Test
	public void example1() {
		assertThat(solution.cellsInRange("K1:L2")).isEqualTo(List.of("K1", "K2", "L1", "L2"));
	}

	@Test
	public void example2() {
		assertThat(solution.cellsInRange("A1:F1")).isEqualTo(List.of("A1", "B1", "C1", "D1", "E1", "F1"));
	}
}
