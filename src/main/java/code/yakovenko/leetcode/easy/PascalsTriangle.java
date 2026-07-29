package code.yakovenko.leetcode.easy;

import java.util.ArrayList;
import java.util.List;

public final class PascalsTriangle {

	public List<List<Integer>> generate(int numRows) {
		final List<List<Integer>> triangle = new ArrayList<>(numRows);

		for (int i = 0; i < numRows; i++) {
			final List<Integer> row = new ArrayList<>(i + 1);

			for (int j = 0; j < i + 1; j++) {
				if (j == 0 || j == i) {
					row.add(1);
				} else {
					final List<Integer> previous = triangle.get(i - 1);
					row.add(previous.get(j - 1) + previous.get(j));
				}
			}

			triangle.add(row);
		}

		return triangle;
	}
}
