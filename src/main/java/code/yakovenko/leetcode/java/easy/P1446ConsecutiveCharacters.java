package code.yakovenko.leetcode.java.easy;

public final class P1446ConsecutiveCharacters {

	public int maxPower(String s) {
		int maxPower = 1, currentPower = 1;

		for (int i = 1; i < s.length(); i++) {
			if (s.charAt(i - 1) == s.charAt(i)) {
				maxPower = Math.max(maxPower, ++currentPower);
			} else {
				currentPower = 1;
			}
		}

		return maxPower;
	}
}
