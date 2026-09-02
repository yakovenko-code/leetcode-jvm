package code.yakovenko.leetcode.easy;

public final class ConsecutiveCharacters {

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
