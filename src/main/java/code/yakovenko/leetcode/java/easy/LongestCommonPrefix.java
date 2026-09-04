package code.yakovenko.leetcode.java.easy;

public final class LongestCommonPrefix {

	public String longestCommonPrefix(String[] strs) {
		String prefix = strs[0];

		for (int i = 1; i < strs.length; i++) {
			final String str = strs[i];

			while (!str.startsWith(prefix)) {
				prefix = prefix.substring(0, prefix.length() - 1);
			}

			if (prefix.isEmpty()) {
				break;
			}
		}

		return prefix;
	}
}
