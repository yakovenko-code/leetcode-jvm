package code.yakovenko.leetcode.easy;

public final class FirstMatchingCharacterFromBothEnds {

	public int firstMatchingIndex(String s) {
		int left = 0, right = s.length() - 1;

		while (left <= right) {
			if (s.charAt(left) == s.charAt(right)) {
				return left;
			}

			left++;
			right--;
		}

		return -1;
	}
}
