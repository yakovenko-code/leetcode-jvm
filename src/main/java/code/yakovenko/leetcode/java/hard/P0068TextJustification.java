package code.yakovenko.leetcode.java.hard;

import java.util.ArrayList;
import java.util.List;

public final class P0068TextJustification {

	public List<String> fullJustify(String[] words, int maxWidth) {
		final List<String> result = new ArrayList<>();

		int i = 0;

		while (i < words.length) {
			int j = i;
			int wordsLength = 0;

			while (j < words.length && wordsLength + (j - i) + words[j].length() <= maxWidth) {
				wordsLength += words[j++].length();
			}

			final StringBuilder stringBuilder = new StringBuilder(maxWidth);
			final int wordsCount = j - i;

			if (j == words.length || wordsCount == 1) {
				while (i < j) {
					stringBuilder.append(words[i++]);

					if (i != j) {
						stringBuilder.append(" ");
					}
				}

				stringBuilder.append(" ".repeat(maxWidth - stringBuilder.length()));
			} else {
				final int spacesLength = maxWidth - wordsLength;
				final int spacesCount = wordsCount - 1;

				final int baseSpaces = spacesLength / spacesCount;
				final int extraSpaces = spacesLength % spacesCount;

				while (i < j) {
					stringBuilder.append(words[i++]);

					if (i != j) {
						final int spaces = baseSpaces + (spacesCount - (j - i) < extraSpaces ? 1 : 0);
						stringBuilder.append(" ".repeat(spaces));
					}
				}
			}

			result.add(stringBuilder.toString());
		}

		return result;
	}
}
