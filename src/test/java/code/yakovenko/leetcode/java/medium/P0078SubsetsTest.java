package code.yakovenko.leetcode.java.medium;

import org.junit.jupiter.api.Test;

import java.util.List;

import static org.assertj.core.api.Assertions.assertThat;

public final class P0078SubsetsTest {

	private final P0078Subsets solution = new P0078Subsets();

	@Test
	public void example1() {
		assertThat(solution.subsets(new int[]{1, 2, 3}))
				.containsExactlyInAnyOrderElementsOf(
						List.of(
								List.of(),
								List.of(1),
								List.of(2),
								List.of(1, 2),
								List.of(3),
								List.of(1, 3),
								List.of(2, 3),
								List.of(1, 2, 3)
						)
				);
	}

	@Test
	public void example2() {
		assertThat(solution.subsets(new int[]{0}))
				.containsExactlyInAnyOrderElementsOf(List.of(List.of(), List.of(0)));
	}
}
