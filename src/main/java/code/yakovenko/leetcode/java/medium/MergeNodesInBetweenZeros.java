package code.yakovenko.leetcode.java.medium;

import code.yakovenko.leetcode.java.utils.ListNode;

public final class MergeNodesInBetweenZeros {

	public ListNode mergeNodes(ListNode head) {
		ListNode current = head, next = current.next;

		while (next != null) {
			while (next.val != 0) {
				current.val += next.val;
				next = next.next;
			}

			current.next = next.next == null ? null : next;
			current = next;
			next = next.next;
		}

		return head;
	}
}
