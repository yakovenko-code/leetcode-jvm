package code.yakovenko.leetcode.java.medium;

import code.yakovenko.leetcode.java.Comparators;
import code.yakovenko.leetcode.java.utils.ListNode;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

public final class MergeNodesInBetweenZerosTest {

	private final MergeNodesInBetweenZeros solution = new MergeNodesInBetweenZeros();

	@Test
	public void example1() {
		assertThat(
				solution.mergeNodes(
						new ListNode(0,
								new ListNode(3,
										new ListNode(1,
												new ListNode(0,
														new ListNode(4,
																new ListNode(5,
																		new ListNode(2,
																				new ListNode(0))))))))
				)
		).usingComparator(
				Comparators::listNode
		).isEqualTo(new ListNode(4, new ListNode(11)));
	}

	@Test
	public void example2() {
		assertThat(
				solution.mergeNodes(
						new ListNode(0,
								new ListNode(1,
										new ListNode(0,
												new ListNode(3,
														new ListNode(0,
																new ListNode(2,
																		new ListNode(2,
																				new ListNode(0))))))))
				)
		).usingComparator(
				Comparators::listNode
		).isEqualTo(new ListNode(1, new ListNode(3, new ListNode(4))));
	}
}
