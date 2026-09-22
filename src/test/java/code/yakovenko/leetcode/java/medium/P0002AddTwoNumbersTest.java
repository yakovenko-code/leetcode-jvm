package code.yakovenko.leetcode.java.medium;

import code.yakovenko.leetcode.java.Comparators;
import code.yakovenko.leetcode.java.utils.ListNode;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

public final class P0002AddTwoNumbersTest {

	private final P0002AddTwoNumbers solution = new P0002AddTwoNumbers();

	@Test
	public void example1() {
		assertThat(
				solution.addTwoNumbers(
						new ListNode(2, new ListNode(4, new ListNode(3))),
						new ListNode(5, new ListNode(6, new ListNode(4)))
				)
		).usingComparator(
				Comparators::listNode
		).isEqualTo(new ListNode(7, new ListNode(0, new ListNode(8))));
	}

	@Test
	public void example2() {
		assertThat(solution.addTwoNumbers(new ListNode(0), new ListNode(0)))
				.usingComparator(Comparators::listNode)
				.isEqualTo(new ListNode(0));
	}

	@Test
	public void example3() {
		assertThat(
				solution.addTwoNumbers(
						new ListNode(9,
								new ListNode(9,
										new ListNode(9,
												new ListNode(9,
														new ListNode(9,
																new ListNode(9,
																		new ListNode(9))))))),
						new ListNode(9, new ListNode(9, new ListNode(9, new ListNode(9))))
				)
		).usingComparator(
				Comparators::listNode
		).isEqualTo(
				new ListNode(8,
						new ListNode(9,
								new ListNode(9,
										new ListNode(9,
												new ListNode(0,
														new ListNode(0,
																new ListNode(0,
																		new ListNode(1))))))))
		);
	}
}
