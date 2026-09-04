package code.yakovenko.leetcode.java.easy;

import code.yakovenko.leetcode.java.Comparators;
import code.yakovenko.leetcode.java.utils.ListNode;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

public final class MergeTwoSortedListsTest {

	private final MergeTwoSortedLists solution = new MergeTwoSortedLists();

	@Test
	public void example1() {
		assertThat(
				solution.mergeTwoLists(
						new ListNode(1, new ListNode(2, new ListNode(4))),
						new ListNode(1, new ListNode(3, new ListNode(4)))
				)
		).usingComparator(
				Comparators::listNode
		).isEqualTo(
				new ListNode(1,
						new ListNode(1,
								new ListNode(2,
										new ListNode(3,
												new ListNode(4,
														new ListNode(4))))))
		);
	}

	@Test
	public void example2() {
		assertThat(solution.mergeTwoLists(null, null))
				.usingComparator(Comparators::listNode)
				.isEqualTo(null);
	}

	@Test
	public void example3() {
		assertThat(solution.mergeTwoLists(null, new ListNode(0)))
				.usingComparator(Comparators::listNode)
				.isEqualTo(new ListNode(0));
	}
}
