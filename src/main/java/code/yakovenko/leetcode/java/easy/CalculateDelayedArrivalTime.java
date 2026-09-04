package code.yakovenko.leetcode.java.easy;

public final class CalculateDelayedArrivalTime {

	public int findDelayedArrivalTime(int arrivalTime, int delayedTime) {
		return (arrivalTime + delayedTime) % 24;
	}
}
