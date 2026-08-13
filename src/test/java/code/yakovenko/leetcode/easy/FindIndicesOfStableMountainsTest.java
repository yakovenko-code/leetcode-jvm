package code.yakovenko.leetcode.easy;

import org.junit.jupiter.api.Test;

import java.util.List;

import static org.assertj.core.api.Assertions.assertThat;

public final class FindIndicesOfStableMountainsTest {

	private final FindIndicesOfStableMountains solution = new FindIndicesOfStableMountains();

	@Test
	public void example1() {
		assertThat(solution.stableMountains(new int[]{1, 2, 3, 4, 5}, 2)).isEqualTo(List.of(3, 4));
	}

	@Test
	public void example2() {
		assertThat(solution.stableMountains(new int[]{10, 1, 10, 1, 10}, 3)).isEqualTo(List.of(1, 3));
	}

	@Test
	public void example3() {
		assertThat(solution.stableMountains(new int[]{10, 1, 10, 1, 10}, 10)).isEqualTo(List.of());
	}
}
