package code.yakovenko.leetcode.java.easy;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

public final class PassThePillowTest {

	private final PassThePillow solution = new PassThePillow();

	@Test
	public void example1() {
		assertThat(solution.passThePillow(4, 5)).isEqualTo(2);
	}

	@Test
	public void example2() {
		assertThat(solution.passThePillow(3, 2)).isEqualTo(3);
	}
}
