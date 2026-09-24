package code.yakovenko.leetcode.java.medium;

import java.util.ArrayList;
import java.util.List;

public final class P0022GenerateParentheses {

	public List<String> generateParenthesis(int n) {
		final List<String> result = new ArrayList<>();

		backtrack(new char[2 * n], 0, 0, 0, n, result);

		return result;
	}

	private void backtrack(
			final char[] current,
			final int index,
			final int opened,
			final int closed,
			final int n,
			final List<String> result
	) {
		if (index == 2 * n) {
			result.add(new String(current));
			return;
		}

		if (opened < n) {
			current[index] = '(';
			backtrack(current, index + 1, opened + 1, closed, n, result);
		}

		if (closed < opened) {
			current[index] = ')';
			backtrack(current, index + 1, opened, closed + 1, n, result);
		}
	}
}
