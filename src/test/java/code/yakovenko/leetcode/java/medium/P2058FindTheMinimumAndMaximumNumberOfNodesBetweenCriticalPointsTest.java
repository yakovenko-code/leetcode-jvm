package code.yakovenko.leetcode.java.medium;

import code.yakovenko.leetcode.java.utils.ListNode;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

public final class P2058FindTheMinimumAndMaximumNumberOfNodesBetweenCriticalPointsTest {

	private final P2058FindTheMinimumAndMaximumNumberOfNodesBetweenCriticalPoints solution =
			new P2058FindTheMinimumAndMaximumNumberOfNodesBetweenCriticalPoints();

	@Test
	public void example1() {
		assertThat(solution.nodesBetweenCriticalPoints(new ListNode(3, new ListNode(1))))
				.isEqualTo(new int[]{-1, -1});
	}

	@Test
	public void example2() {
		assertThat(
				solution.nodesBetweenCriticalPoints(
						new ListNode(5,
								new ListNode(3,
										new ListNode(1,
												new ListNode(2,
														new ListNode(5,
																new ListNode(1,
																		new ListNode(2)))))))
				)
		).isEqualTo(new int[]{1, 3});
	}

	@Test
	public void example3() {
		assertThat(
				solution.nodesBetweenCriticalPoints(
						new ListNode(1,
								new ListNode(3,
										new ListNode(2,
												new ListNode(2,
														new ListNode(3,
																new ListNode(2,
																		new ListNode(2,
																				new ListNode(7))))))))
				)
		).isEqualTo(new int[]{3, 3});
	}
}
