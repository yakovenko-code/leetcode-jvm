package code.yakovenko.leetcode.java.easy;

import java.util.ArrayList;
import java.util.List;

public final class KidsWithTheGreatestNumberOfCandies {

	public List<Boolean> kidsWithCandies(int[] candies, int extraCandies) {
		final List<Boolean> result = new ArrayList<>(candies.length);
		final int maxCandy = max(candies);

		for (final int candy : candies) {
			result.add(candy + extraCandies >= maxCandy);
		}

		return result;
	}

	private int max(int[] nums) {
		int max = 0;

		for (final int num : nums) {
			max = Math.max(max, num);
		}

		return max;
	}
}
