package code.yakovenko.leetcode.easy;

public final class GenerateTagForVideoCaption {

	public String generateTag(String caption) {
		final StringBuilder stringBuilder = new StringBuilder("#");
		final int size = caption.length();

		boolean newWord = false;
		int currentLength = 1;

		for (int i = 0; i < size && currentLength < 100; i++) {
			final char character = caption.charAt(i);

			if (character != ' ') {
				if (currentLength == 1) {
					stringBuilder.append(Character.toLowerCase(character));
				} else if (newWord) {
					stringBuilder.append(Character.toUpperCase(character));
				} else {
					stringBuilder.append(Character.toLowerCase(character));
				}

				currentLength++;
			}

			newWord = character == ' ';
		}

		return stringBuilder.toString();
	}
}
