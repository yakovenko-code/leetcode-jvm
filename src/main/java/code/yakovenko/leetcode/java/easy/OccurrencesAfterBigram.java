package code.yakovenko.leetcode.java.easy;

import java.util.ArrayList;
import java.util.List;

public final class OccurrencesAfterBigram {

	public String[] findOcurrences(String text, String first, String second) {
		final String[] tokens = text.split(" ");
		final List<String> result = new ArrayList<>(tokens.length - 2);

		for (int i = 0; i < tokens.length - 2; i++) {
			if (tokens[i].equals(first) && tokens[i + 1].equals(second)) {
				result.add(tokens[i + 2]);
			}
		}

		return result.toArray(new String[0]);
	}
}
