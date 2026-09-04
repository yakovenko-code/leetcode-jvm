package code.yakovenko.leetcode.java.easy;

import code.yakovenko.leetcode.java.Comparators;
import code.yakovenko.leetcode.java.utils.ListNode;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

public final class MiddleOfTheLinkedListTest {

	private final MiddleOfTheLinkedList solution = new MiddleOfTheLinkedList();

	@Test
	public void example1() {
		assertThat(
				solution.middleNode(
						new ListNode(1,
								new ListNode(2,
										new ListNode(3,
												new ListNode(4,
														new ListNode(5)))))
				)
		).usingComparator(
				Comparators::listNode
		).isEqualTo(new ListNode(3, new ListNode(4, new ListNode(5))));
	}

	@Test
	public void example2() {
		assertThat(
				solution.middleNode(
						new ListNode(1,
								new ListNode(2,
										new ListNode(3,
												new ListNode(4,
														new ListNode(5,
																new ListNode(6))))))
				)
		).usingComparator(
				Comparators::listNode
		).isEqualTo(new ListNode(4, new ListNode(5, new ListNode(6))));
	}
}
