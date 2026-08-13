package code.yakovenko.leetcode.easy;

import code.yakovenko.leetcode.Comparators;
import code.yakovenko.leetcode.utils.ListNode;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

public final class RemoveLinkedListElementsTest {

	private final RemoveLinkedListElements solution = new RemoveLinkedListElements();

	@Test
	public void test1() {
		assertThat(solution.removeElements(
				new ListNode(1,
						new ListNode(2,
								new ListNode(6,
										new ListNode(3,
												new ListNode(4,
														new ListNode(5,
																new ListNode(6))))))),
				6)
		).usingComparator(
				Comparators::listNode
		).isEqualTo(
				new ListNode(1, new ListNode(2, new ListNode(3, new ListNode(4, new ListNode(5)))))
		);
	}

	@Test
	public void test2() {
		assertThat(solution.removeElements(null, 1))
				.usingComparator(Comparators::listNode)
				.isEqualTo(null);
	}

	@Test
	public void test3() {
		assertThat(solution.removeElements(
				new ListNode(7, new ListNode(7, new ListNode(7, new ListNode(7)))), 7)
		).usingComparator(
				Comparators::listNode
		).isEqualTo(null);
	}
}
