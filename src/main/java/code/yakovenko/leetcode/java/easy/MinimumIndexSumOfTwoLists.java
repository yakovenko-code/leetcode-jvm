package code.yakovenko.leetcode.java.easy;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public final class MinimumIndexSumOfTwoLists {

	public String[] findRestaurant(String[] list1, String[] list2) {
		final Map<String, Integer> indexMap = new HashMap<>();
		final List<String> result = new ArrayList<>();

		for (int i = 0; i < list1.length; i++) {
			indexMap.put(list1[i], i);
		}

		int min = Integer.MAX_VALUE;

		for (int i = 0; i < list2.length; i++) {
			final Integer index = indexMap.get(list2[i]);

			if (index != null) {
				final int sum = index + i;

				if (min > sum) {
					min = sum;
					result.clear();
					result.add(list2[i]);
				} else if (min == sum) {
					result.add(list2[i]);
				}
			}
		}

		return result.toArray(new String[0]);
	}
}
