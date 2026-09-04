package code.yakovenko.leetcode.java.easy;

import java.util.HashSet;
import java.util.Set;

public final class ContainsDuplicate {

	public boolean containsDuplicate(int[] nums) {
		final Set<Integer> set = new HashSet<>(nums.length);

		for (final int num : nums) {
			if (!set.add(num)) {
				return true;
			}
		}

		return false;
	}
}
