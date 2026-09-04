package code.yakovenko.leetcode.java.easy;

public final class MinimumNumberOfChairsInAWaitingRoom {

	public int minimumChairs(String s) {
		int currentOccupancy = 0, maxOccupancy = 0;

		for (final char event : s.toCharArray()) {
			if (event == 'E') {
				currentOccupancy++;
			} else {
				currentOccupancy--;
			}

			maxOccupancy = Math.max(currentOccupancy, maxOccupancy);
		}

		return maxOccupancy;
	}
}
