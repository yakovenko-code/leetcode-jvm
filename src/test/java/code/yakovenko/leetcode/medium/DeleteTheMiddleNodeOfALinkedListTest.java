package code.yakovenko.leetcode.medium;

import code.yakovenko.leetcode.Comparators;
import code.yakovenko.leetcode.utils.ListNode;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

public final class DeleteTheMiddleNodeOfALinkedListTest {

	private final DeleteTheMiddleNodeOfALinkedList solution = new DeleteTheMiddleNodeOfALinkedList();

	@Test
	public void test1() {
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
	public void test2() {
		assertThat(
				solution.deleteMiddle(new ListNode(1, new ListNode(2, new ListNode(3, new ListNode(4)))))
		).usingComparator(
				Comparators::listNode
		).isEqualTo(new ListNode(1, new ListNode(2, new ListNode(4))));
	}

	@Test
	public void test3() {
		assertThat(solution.deleteMiddle(new ListNode(2, new ListNode(1))))
				.usingComparator(Comparators::listNode)
				.isEqualTo(new ListNode(2));
	}
}
