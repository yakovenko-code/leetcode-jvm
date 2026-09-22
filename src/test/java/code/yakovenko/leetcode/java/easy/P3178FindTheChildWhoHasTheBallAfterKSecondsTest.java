package code.yakovenko.leetcode.java.easy;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

public final class P3178FindTheChildWhoHasTheBallAfterKSecondsTest {

	private final P3178FindTheChildWhoHasTheBallAfterKSeconds solution = new P3178FindTheChildWhoHasTheBallAfterKSeconds();

	@Test
	public void example1() {
		assertThat(solution.numberOfChild(3, 5)).isEqualTo(1);
	}

	@Test
	public void example2() {
		assertThat(solution.numberOfChild(5, 6)).isEqualTo(2);
	}

	@Test
	public void example3() {
		assertThat(solution.numberOfChild(4, 2)).isEqualTo(2);
	}
}
