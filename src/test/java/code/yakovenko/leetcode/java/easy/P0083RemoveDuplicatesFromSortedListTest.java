package code.yakovenko.leetcode.java.easy;

import code.yakovenko.leetcode.java.Comparators;
import code.yakovenko.leetcode.java.utils.ListNode;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

public final class P0083RemoveDuplicatesFromSortedListTest {

	private final P0083RemoveDuplicatesFromSortedList solution = new P0083RemoveDuplicatesFromSortedList();

	@Test
	public void example1() {
		assertThat(solution.deleteDuplicates(new ListNode(1, new ListNode(1, new ListNode(2)))))
				.usingComparator(Comparators::listNode)
				.isEqualTo(new ListNode(1, new ListNode(2)));
	}

	@Test
	public void example2() {
		assertThat(solution.deleteDuplicates(
				new ListNode(1,
						new ListNode(1,
								new ListNode(2,
										new ListNode(3,
												new ListNode(3))))))
		).usingComparator(
				Comparators::listNode
		).isEqualTo(new ListNode(1, new ListNode(2, new ListNode(3))));
	}
}
