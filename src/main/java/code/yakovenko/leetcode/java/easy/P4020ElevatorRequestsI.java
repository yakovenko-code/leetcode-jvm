package code.yakovenko.leetcode.java.easy;

public final class P4020ElevatorRequestsI {

	public int elevatorRequests(int n, int[] requests) {
		int result = requests[0];

		for (int i = 1; i < requests.length; i++) {
			result += Math.abs(requests[i] - requests[i - 1]);
		}

		return result;
	}
}
