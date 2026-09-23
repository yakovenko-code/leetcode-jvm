package code.yakovenko.leetcode.java.medium;

import code.yakovenko.leetcode.java.utils.ListNode;

public final class P2058FindTheMinimumAndMaximumNumberOfNodesBetweenCriticalPoints {

	public int[] nodesBetweenCriticalPoints(ListNode head) {
		int firstCriticalPoint = -1;
		int lastCriticalPoint = -1;
		int minDistance = Integer.MAX_VALUE;

		ListNode previous = head, current = previous.next;
		int position = 2;

		while (current.next != null) {
			final int previousVal = previous.val;
			final int currentVal = current.val;
			final int nextVal = current.next.val;

			if (previousVal > currentVal && currentVal < nextVal || previousVal < currentVal && currentVal > nextVal) {
				if (firstCriticalPoint == -1) {
					firstCriticalPoint = position;
				} else {
					minDistance = Math.min(minDistance, position - lastCriticalPoint);
				}

				lastCriticalPoint = position;
			}

			previous = current;
			current = current.next;
			position++;
		}

		if (firstCriticalPoint == lastCriticalPoint) {
			return new int[]{-1, -1};
		}

		return new int[]{minDistance, lastCriticalPoint - firstCriticalPoint};
	}
}
