package code.yakovenko.leetcode.java.easy;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

public final class RemoveDuplicatesFromSortedArrayTest {

	private final RemoveDuplicatesFromSortedArray solution = new RemoveDuplicatesFromSortedArray();

	@Test
	public void example1() {
		int[] nums = new int[]{1, 1, 2};
		int[] expectedNums = new int[]{1, 2};

		int k = solution.removeDuplicates(nums);

		assertThat(k).isEqualTo(expectedNums.length);
		for (int i = 0; i < k; i++) {
			assertThat(nums[i]).isEqualTo(expectedNums[i]);
		}
	}

	@Test
	public void example2() {
		int[] nums = new int[]{0, 0, 1, 1, 1, 2, 2, 3, 3, 4};
		int[] expectedNums = new int[]{0, 1, 2, 3, 4};

		int k = solution.removeDuplicates(nums);

		assertThat(k).isEqualTo(expectedNums.length);
		for (int i = 0; i < k; i++) {
			assertThat(nums[i]).isEqualTo(expectedNums[i]);
		}
	}
}
