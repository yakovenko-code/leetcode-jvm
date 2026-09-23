package code.yakovenko.leetcode.java.easy;

import java.util.ArrayList;
import java.util.List;

public final class P2194CellsInARangeOnAnExcelSheet {

	public List<String> cellsInRange(String s) {
		final char startColumn = s.charAt(0);
		final char startRow = s.charAt(1);

		final char stopColumn = s.charAt(3);
		final char stopRow = s.charAt(4);

		final List<String> result = new ArrayList<>(
				(stopColumn - startColumn + 1) * (stopRow - startRow + 1)
		);

		for (char column = startColumn; column <= stopColumn; column++) {
			for (char row = startRow; row <= stopRow; row++) {
				result.add(new String(new char[]{column, row}));
			}
		}

		return result;
	}
}
