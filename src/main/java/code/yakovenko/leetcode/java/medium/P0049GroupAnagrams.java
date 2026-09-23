package code.yakovenko.leetcode.java.medium;

import java.util.*;

public final class P0049GroupAnagrams {

	public List<List<String>> groupAnagrams(String[] strs) {
		final Map<String, List<String>> groups = new HashMap<>();

		for (final String str : strs) {
			groups.computeIfAbsent(sortString(str), _ -> new ArrayList<>()).add(str);
		}

		return new ArrayList<>(groups.values());
	}

	private String sortString(final String string) {
		final char[] strArray = string.toCharArray();
		Arrays.sort(strArray);

		return new String(strArray);
	}
}
