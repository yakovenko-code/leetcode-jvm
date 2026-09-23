package code.yakovenko.leetcode.java.medium;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

public final class P0146LRUCacheTest {

	@Test
	public void example1() {
		final P0146LRUCache solution = new P0146LRUCache(2);

		solution.put(1, 1);
		solution.put(2, 2);
		assertThat(solution.get(1)).isEqualTo(1);
		solution.put(3, 3);
		assertThat(solution.get(2)).isEqualTo(-1);
		solution.put(4, 4);
		assertThat(solution.get(1)).isEqualTo(-1);
		assertThat(solution.get(3)).isEqualTo(3);
		assertThat(solution.get(4)).isEqualTo(4);
	}
}
