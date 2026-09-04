package code.yakovenko.leetcode.java.easy;

import org.junit.jupiter.api.Test;

import java.util.Arrays;

import static org.assertj.core.api.Assertions.assertThat;

public final class RemoveElementTest {

	private final RemoveElement solution = new RemoveElement();

	@Test
	public void example1() {
		int[] nums = {3, 2, 2, 3};
		int val = 3;
		int[] expectedNums = {2, 2};

		int k = solution.removeElement(nums, val);

		assertThat(k).isEqualTo(expectedNums.length);
		Arrays.sort(nums, 0, k);
		for (int i = 0; i < k; i++) {
			assertThat(nums[i]).isEqualTo(expectedNums[i]);
		}
	}

	@Test
	public void example2() {
		int[] nums = {0, 1, 2, 2, 3, 0, 4, 2};
		int val = 2;
		int[] expectedNums = {0, 0, 1, 3, 4};

		int k = solution.removeElement(nums, val);

		assertThat(k).isEqualTo(expectedNums.length);
		Arrays.sort(nums, 0, k);
		for (int i = 0; i < k; i++) {
			assertThat(nums[i]).isEqualTo(expectedNums[i]);
		}
	}
}
