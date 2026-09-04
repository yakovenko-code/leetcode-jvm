package code.yakovenko.leetcode.java.easy;

import java.util.ArrayList;
import java.util.List;

public final class FindWordsContainingCharacter {

	public List<Integer> findWordsContaining(String[] words, char x) {
		final List<Integer> result = new ArrayList<>();

		for (int i = 0; i < words.length; i++) {
			if (words[i].indexOf(x) != -1) {
				result.add(i);
			}
		}

		return result;
	}
}
