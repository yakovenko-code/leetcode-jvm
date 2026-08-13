package code.yakovenko.leetcode.medium;

import code.yakovenko.leetcode.utils.ListNode;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

public final class MaximumTwinSumOfALinkedListTest {

	private final MaximumTwinSumOfALinkedList solution = new MaximumTwinSumOfALinkedList();

	@Test
	public void example1() {
		assertThat(solution.pairSum(new ListNode(5, new ListNode(4, new ListNode(2, new ListNode(1))))))
				.isEqualTo(6);
	}

	@Test
	public void example2() {
		assertThat(solution.pairSum(new ListNode(4, new ListNode(2, new ListNode(2, new ListNode(3))))))
				.isEqualTo(7);
	}

	@Test
	public void example3() {
		assertThat(solution.pairSum(new ListNode(1, new ListNode(100000)))).isEqualTo(100001);
	}
}
