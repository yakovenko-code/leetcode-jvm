package code.yakovenko.leetcode.java;

import code.yakovenko.leetcode.java.utils.ListNode;

public final class Comparators {

	private Comparators() {
		throw new AssertionError("No Comparators instances for you!");
	}

	public static int listNode(ListNode list1, ListNode list2) {
		if (list1 == null && list2 == null) return 0;
		if (list1 == null) return -1;
		if (list2 == null) return 1;
		if (list1.val != list2.val) return Integer.compare(list1.val, list2.val);

		return listNode(list1.next, list2.next);
	}
}
