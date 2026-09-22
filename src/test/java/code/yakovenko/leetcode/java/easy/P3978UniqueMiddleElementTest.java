package code.yakovenko.leetcode.java.easy;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

public final class P3978UniqueMiddleElementTest {

	private final P3978UniqueMiddleElement solution = new P3978UniqueMiddleElement();

	@Test
	public void example1() {
		assertThat(solution.isMiddleElementUnique(new int[]{1, 2, 3})).isTrue();
	}

	@Test
	public void example2() {
		assertThat(solution.isMiddleElementUnique(new int[]{1, 2, 2})).isFalse();
	}
}
