package code.yakovenko.leetcode.java.easy;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

public final class MinimumIndexSumOfTwoListsTest {

	private final MinimumIndexSumOfTwoLists solution = new MinimumIndexSumOfTwoLists();

	@Test
	public void example1() {
		assertThat(
				solution.findRestaurant(
						new String[]{"Shogun", "Tapioca Express", "Burger King", "KFC"},
						new String[]{"Piatti", "The Grill at Torrey Pines", "Hungry Hunter Steakhouse", "Shogun"}
				)
		).isEqualTo(new String[]{"Shogun"});
	}

	@Test
	public void example2() {
		assertThat(solution.findRestaurant(new String[]{"happy", "sad", "good"}, new String[]{"sad", "happy", "good"}))
				.isEqualTo(new String[]{"sad", "happy"});
	}
}
