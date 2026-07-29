package code.yakovenko.leetcode.medium;

import code.yakovenko.leetcode.utils.ListNode;

public final class DeleteTheMiddleNodeOfALinkedList {

	public ListNode deleteMiddle(ListNode head) {
		if (head.next == null) return null;

		ListNode slow = new ListNode(-1, head), fast = head;

		while (fast != null && fast.next != null) {
			fast = fast.next.next;
			slow = slow.next;
		}

		slow.next = slow.next.next;

		return head;
	}
}
