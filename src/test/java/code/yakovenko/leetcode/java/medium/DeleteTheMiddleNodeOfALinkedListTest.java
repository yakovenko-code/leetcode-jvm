package code.yakovenko.leetcode.java.medium;

import code.yakovenko.leetcode.java.Comparators;
import code.yakovenko.leetcode.java.utils.ListNode;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

public final class DeleteTheMiddleNodeOfALinkedListTest {

	private final DeleteTheMiddleNodeOfALinkedList solution = new DeleteTheMiddleNodeOfALinkedList();

	@Test
	public void example1() {
		assertThat(
				solution.deleteMiddle(
						new ListNode(1,
								new ListNode(3,
										new ListNode(4,
												new ListNode(7,
														new ListNode(1,
																new ListNode(2,
																		new ListNode(6)))))))
				)
		).usingComparator(
				Comparators::listNode
		).isEqualTo(
				new ListNode(1,
						new ListNode(3,
								new ListNode(4,
										new ListNode(1,
												new ListNode(2,
														new ListNode(6))))))
		);
	}

	@Test
	public void example2() {
		assertThat(
				solution.deleteMiddle(new ListNode(1, new ListNode(2, new ListNode(3, new ListNode(4)))))
		).usingComparator(
				Comparators::listNode
		).isEqualTo(new ListNode(1, new ListNode(2, new ListNode(4))));
	}

	@Test
	public void example3() {
		assertThat(solution.deleteMiddle(new ListNode(2, new ListNode(1))))
				.usingComparator(Comparators::listNode)
				.isEqualTo(new ListNode(2));
	}
}
