package code.yakovenko.leetcode.easy;

import org.junit.jupiter.api.Test;

import java.util.List;

import static org.assertj.core.api.Assertions.assertThat;

public final class KidsWithTheGreatestNumberOfCandiesTest {

	private final KidsWithTheGreatestNumberOfCandies solution = new KidsWithTheGreatestNumberOfCandies();

	@Test
	public void example1() {
		assertThat(solution.kidsWithCandies(new int[]{2, 3, 5, 1, 3}, 3))
				.isEqualTo(List.of(true, true, true, false, true));
	}

	@Test
	public void example2() {
		assertThat(solution.kidsWithCandies(new int[]{4, 2, 1, 1, 2}, 1))
				.isEqualTo(List.of(true, false, false, false, false));
	}

	@Test
	public void example3() {
		assertThat(solution.kidsWithCandies(new int[]{12, 1, 12}, 10))
				.isEqualTo(List.of(true, false, true));
	}
}
