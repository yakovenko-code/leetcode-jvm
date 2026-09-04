package code.yakovenko.leetcode.java.easy;

import java.util.List;

public final class CountItemsMatchingARule {

	public int countMatches(List<List<String>> items, String ruleKey, String ruleValue) {
		int result = 0;

		final int index = switch (ruleKey) {
			case "type" -> 0;
			case "color" -> 1;
			case "name" -> 2;
			default -> -1;
		};

		for (final List<String> item : items) {
			if (ruleValue.equals(item.get(index))) {
				result++;
			}
		}

		return result;
	}
}
