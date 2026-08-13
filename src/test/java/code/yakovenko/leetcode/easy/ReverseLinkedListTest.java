package code.yakovenko.leetcode.easy;

import code.yakovenko.leetcode.Comparators;
import code.yakovenko.leetcode.utils.ListNode;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

public final class ReverseLinkedListTest {

	private final ReverseLinkedList solution = new ReverseLinkedList();

	@Test
	public void example1() {
		assertThat(
				solution.reverseList(
						new ListNode(1,
								new ListNode(2,
										new ListNode(3,
												new ListNode(4,
														new ListNode(5)))))
				)
		).usingComparator(
				Comparators::listNode
		).isEqualTo(
				new ListNode(
						5, new ListNode(
						4, new ListNode(
						3, new ListNode(
						2, new ListNode(1)))))
		);
	}

	@Test
	public void example2() {
		assertThat(solution.reverseList(new ListNode(1, new ListNode(2))))
				.usingComparator(Comparators::listNode)
				.isEqualTo(new ListNode(2, new ListNode(1)));
	}

	@Test
	public void example3() {
		assertThat(solution.reverseList(null))
				.usingComparator(Comparators::listNode)
				.isEqualTo(null);
	}
}
