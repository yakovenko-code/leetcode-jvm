package code.yakovenko.leetcode.easy;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

public final class CheckIfTwoChessboardSquaresHaveTheSameColorTest {

	private final CheckIfTwoChessboardSquaresHaveTheSameColor solution =
			new CheckIfTwoChessboardSquaresHaveTheSameColor();

	@Test
	public void example1() {
		assertThat(solution.checkTwoChessboards("a1", "c3")).isTrue();
	}

	@Test
	public void example2() {
		assertThat(solution.checkTwoChessboards("a1", "h3")).isFalse();
	}
}
