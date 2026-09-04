package code.yakovenko.leetcode.java.easy;

import code.yakovenko.leetcode.java.utils.ListNode;

public final class ReverseLinkedList {

	public ListNode reverseList(ListNode head) {
		ListNode prev = null, current = head;

		while (current != null) {
			final ListNode next = current.next;

			current.next = prev;
			prev = current;
			current = next;
		}

		return prev;
	}
}
