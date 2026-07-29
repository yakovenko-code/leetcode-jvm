package code.yakovenko.leetcode.easy;

import code.yakovenko.leetcode.utils.ListNode;

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
