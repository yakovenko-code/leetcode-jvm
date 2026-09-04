package code.yakovenko.leetcode.java.easy;

public final class CheckIfAllAsAppearsBeforeAllBs {

	public boolean checkString(String s) {
		final int firstB = s.indexOf('b');

		if (firstB == -1) {
			return true;
		}

		final int lastA = s.lastIndexOf('a');

		return firstB > lastA;
	}
}
