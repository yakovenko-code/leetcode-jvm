package code.yakovenko.leetcode.java.easy;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

public final class P2582PassThePillowTest {

	private final P2582PassThePillow solution = new P2582PassThePillow();

	@Test
	public void example1() {
		assertThat(solution.passThePillow(4, 5)).isEqualTo(2);
	}

	@Test
	public void example2() {
		assertThat(solution.passThePillow(3, 2)).isEqualTo(3);
	}
}
