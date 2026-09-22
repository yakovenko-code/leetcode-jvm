package code.yakovenko.leetcode.java.easy;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

public final class P3274CheckIfTwoChessboardSquaresHaveTheSameColorTest {

	private final P3274CheckIfTwoChessboardSquaresHaveTheSameColor solution =
			new P3274CheckIfTwoChessboardSquaresHaveTheSameColor();

	@Test
	public void example1() {
		assertThat(solution.checkTwoChessboards("a1", "c3")).isTrue();
	}

	@Test
	public void example2() {
		assertThat(solution.checkTwoChessboards("a1", "h3")).isFalse();
	}
}
