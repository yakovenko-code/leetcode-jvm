package code.yakovenko.leetcode.java.easy;

import java.util.ArrayDeque;
import java.util.Deque;
import java.util.Map;

public final class ValidParentheses {

	private final static Map<Character, Character> BRACKETS = Map.of(
			')', '(',
			']', '[',
			'}', '{'
	);

	public boolean isValid(String s) {
		if (s.length() % 2 != 0) return false;

		final Deque<Character> stack = new ArrayDeque<>();

		for (int i = 0; i < s.length(); i++) {
			final char element = s.charAt(i);
			final Character expectedOpening = BRACKETS.get(element);

			if (expectedOpening == null) {
				stack.push(element);
			} else if (stack.isEmpty() || stack.pop() != expectedOpening) {
				return false;
			}
		}

		return stack.isEmpty();
	}
}
