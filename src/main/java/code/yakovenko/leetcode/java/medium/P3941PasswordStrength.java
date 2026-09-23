package code.yakovenko.leetcode.java.medium;

import java.util.Arrays;

public final class P3941PasswordStrength {

	private static final int[] POINTS = new int[128];

	static {
		Arrays.fill(POINTS, 'a', 'z' + 1, 1);
		Arrays.fill(POINTS, 'A', 'Z' + 1, 2);
		Arrays.fill(POINTS, '0', '9' + 1, 3);
		for (final char c : "!@#$".toCharArray()) POINTS[c] = 5;
	}

	public int passwordStrength(String password) {
		final boolean[] used = new boolean[128];

		int strength = 0;

		for (final char character : password.toCharArray()) {
			if (!used[character]) {
				strength += POINTS[character];
				used[character] = true;
			}
		}

		return strength;
	}
}
