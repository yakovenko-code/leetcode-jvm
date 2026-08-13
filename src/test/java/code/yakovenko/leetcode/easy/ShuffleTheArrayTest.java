package code.yakovenko.leetcode.easy;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

public final class ShuffleTheArrayTest {

	private final ShuffleTheArray solution = new ShuffleTheArray();

	@Test
	public void test1() {
		assertThat(solution.shuffle(new int[]{2, 5, 1, 3, 4, 7}, 3)).isEqualTo(new int[]{2, 3, 5, 4, 1, 7});
	}

	@Test
	public void test2() {
		assertThat(solution.shuffle(new int[]{1, 2, 3, 4, 4, 3, 2, 1}, 4))
				.isEqualTo(new int[]{1, 4, 2, 3, 3, 2, 4, 1});
	}

	@Test
	public void test3() {
		assertThat(solution.shuffle(new int[]{1, 1, 2, 2}, 2)).isEqualTo(new int[]{1, 2, 1, 2});
	}
}
