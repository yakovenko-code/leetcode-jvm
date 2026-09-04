package code.yakovenko.leetcode.java.medium;

import code.yakovenko.leetcode.java.utils.ListNode;

public final class InsertGreatestCommonDivisorsInLinkedList {

	public ListNode insertGreatestCommonDivisors(ListNode head) {
		if (head.next == null) return head;

		ListNode current = head;

		while (current.next != null) {
			final ListNode next = current.next;

			current.next = new ListNode(gcd(current.val, next.val));
			current.next.next = next;
			current = next;
		}

		return head;
	}

	private int gcd(int first, int second) {
		while (second != 0) {
			final int tmp = second;
			second = first % second;
			first = tmp;
		}

		return Math.abs(first);
	}
}
