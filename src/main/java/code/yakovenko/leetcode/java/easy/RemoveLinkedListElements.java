package code.yakovenko.leetcode.java.easy;

import code.yakovenko.leetcode.java.utils.ListNode;

public final class RemoveLinkedListElements {

	public ListNode removeElements(ListNode head, int val) {
		ListNode dummy = new ListNode(0, head);
		ListNode previous = dummy, current = previous.next;

		while (current != null) {
			if (current.val == val) {
				previous.next = current.next;
			} else {
				previous = current;
			}

			current = current.next;
		}

		return dummy.next;
	}
}
