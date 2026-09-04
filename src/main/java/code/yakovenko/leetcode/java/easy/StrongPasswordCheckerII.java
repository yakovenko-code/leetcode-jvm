package code.yakovenko.leetcode.java.easy;

public final class StrongPasswordCheckerII {

	private static final boolean[] SPECIAL_CHARS = new boolean[128];

	static {
		for (char c : "!@#$%^&*()-+".toCharArray()) {
			SPECIAL_CHARS[c] = true;
		}
	}

	public boolean strongPasswordCheckerII(String password) {
		if (password.length() < 8) return false;

		boolean containLowercase = false;
		boolean containUppercase = false;
		boolean containDigit = false;
		boolean containSpecial = false;

		for (int i = 0; i < password.length(); i++) {
			final char character = password.charAt(i);

			if (i != 0 && password.charAt(i - 1) == character) {
				return false;
			} else if (Character.isLowerCase(character)) {
				containLowercase = true;
			} else if (Character.isUpperCase(character)) {
				containUppercase = true;
			} else if (Character.isDigit(character)) {
				containDigit = true;
			} else if (SPECIAL_CHARS[character]) {
				containSpecial = true;
			}
		}

		return containLowercase && containUppercase && containDigit && containSpecial;
	}
}
