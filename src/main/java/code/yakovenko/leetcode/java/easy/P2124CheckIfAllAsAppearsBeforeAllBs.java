package code.yakovenko.leetcode.java.easy;

public final class P2124CheckIfAllAsAppearsBeforeAllBs {

	public boolean checkString(String s) {
		final int firstB = s.indexOf('b');

		if (firstB == -1) {
			return true;
		}

		final int lastA = s.lastIndexOf('a');

		return firstB > lastA;
	}
}
