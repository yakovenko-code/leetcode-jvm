package code.yakovenko.leetcode.easy;

public final class DivideAStringIntoGroupsOfSizeK {

	public String[] divideString(String s, int k, char fill) {
		final int size = s.length();
		final int groupsCount = (size + k - 1) / k;
		final String[] groups = new String[groupsCount];

		for (int i = 0; i < groupsCount; i++) {
			final int start = k * i;
			final int stop = Math.min(size, k * (i + 1));
			String group = s.substring(start, stop);

			if (group.length() < k) {
				group += Character.toString(fill).repeat(k - group.length());
			}

			groups[i] = group;
		}

		return groups;
	}
}
