package code.yakovenko.leetcode.java.medium;

import code.yakovenko.leetcode.java.utils.ListNode;

public final class P0002AddTwoNumbers {

	public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
		final ListNode dummy = new ListNode();
		ListNode current = dummy;
		int carry = 0;

		while (l1 != null || l2 != null || carry != 0) {
			int sum = carry;

			if (l1 != null) {
				sum += l1.val;
				l1 = l1.next;
			}

			if (l2 != null) {
				sum += l2.val;
				l2 = l2.next;
			}

			current.next = new ListNode(sum % 10);
			carry = sum / 10;
			current = current.next;
		}

		return dummy.next;
	}
}
