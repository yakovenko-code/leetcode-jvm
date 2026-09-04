package code.yakovenko.leetcode.java.easy;

public final class NumberOfChangingKeys {

	public int countKeyChanges(String s) {
		int count = 0;
		char previous = Character.toLowerCase(s.charAt(0));

		for (int i = 1; i < s.length(); i++) {
			char current = Character.toLowerCase(s.charAt(i));

			if (previous != current) {
				count++;
			}

			previous = current;
		}

		return count;
	}
}
