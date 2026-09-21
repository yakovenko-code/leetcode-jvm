package code.yakovenko.leetcode.java.easy;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

public final class UniqueMiddleElementTest {

	private final UniqueMiddleElement solution = new UniqueMiddleElement();

	@Test
	public void example1() {
		assertThat(solution.isMiddleElementUnique(new int[]{1, 2, 3})).isTrue();
	}

	@Test
	public void example2() {
		assertThat(solution.isMiddleElementUnique(new int[]{1, 2, 2})).isFalse();
	}
}
