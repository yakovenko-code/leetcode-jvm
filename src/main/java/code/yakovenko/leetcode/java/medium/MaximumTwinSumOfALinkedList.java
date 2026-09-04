package code.yakovenko.leetcode.java.medium;

import code.yakovenko.leetcode.java.utils.ListNode;


public final class MaximumTwinSumOfALinkedList {

	public int pairSum(ListNode head) {
		ListNode slow = head, fast = head;

		while (fast != null && fast.next != null) {
			fast = fast.next.next;
			slow = slow.next;
		}

		ListNode prev = null;

		while (slow != null) {
			final ListNode next = slow.next;

			slow.next = prev;
			prev = slow;
			slow = next;
		}

		int maxSum = 0;
		ListNode current = head;

		while (current != null && prev != null) {
			maxSum = Math.max(maxSum, prev.val + current.val);
			prev = prev.next;
			current = current.next;
		}

		return maxSum;
	}
}
