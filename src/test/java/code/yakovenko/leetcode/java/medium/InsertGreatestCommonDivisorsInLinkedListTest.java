package code.yakovenko.leetcode.java.medium;

import code.yakovenko.leetcode.java.Comparators;
import code.yakovenko.leetcode.java.utils.ListNode;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

public final class InsertGreatestCommonDivisorsInLinkedListTest {

	private final InsertGreatestCommonDivisorsInLinkedList solution = new InsertGreatestCommonDivisorsInLinkedList();

	@Test
	public void example1() {
		assertThat(
				solution.insertGreatestCommonDivisors(
						new ListNode(18, new ListNode(6, new ListNode(10, new ListNode(3))))
				)
		).usingComparator(
				Comparators::listNode
		).isEqualTo(
				new ListNode(18,
						new ListNode(6,
								new ListNode(6,
										new ListNode(2,
												new ListNode(10,
														new ListNode(1,
																new ListNode(3)))))))
		);
	}

	@Test
	public void example2() {
		assertThat(solution.insertGreatestCommonDivisors(new ListNode(7)))
				.usingComparator(Comparators::listNode)
				.isEqualTo(new ListNode(7));
	}
}
