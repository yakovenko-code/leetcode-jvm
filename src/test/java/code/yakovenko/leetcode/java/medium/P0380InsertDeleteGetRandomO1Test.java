package code.yakovenko.leetcode.java.medium;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

public final class P0380InsertDeleteGetRandomO1Test {

	@Test
	public void example1() {
		final P0380InsertDeleteGetRandomO1 solution = new P0380InsertDeleteGetRandomO1();

		assertThat(solution.insert(1)).isTrue();
		assertThat(solution.remove(2)).isFalse();
		assertThat(solution.insert(2)).isTrue();
		assertThat(solution.getRandom()).isIn(1, 2);
		assertThat(solution.remove(1)).isTrue();
		assertThat(solution.insert(2)).isFalse();
		assertThat(solution.getRandom()).isEqualTo(2);
	}
}
