package code.yakovenko.leetcode.java.easy;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

public final class DetermineColorOfAChessboardSquareTest {

	private final DetermineColorOfAChessboardSquare solution = new DetermineColorOfAChessboardSquare();

	@Test
	public void example1() {
		assertThat(solution.squareIsWhite("a1")).isFalse();
	}

	@Test
	public void example2() {
		assertThat(solution.squareIsWhite("h3")).isTrue();
	}

	@Test
	public void example3() {
		assertThat(solution.squareIsWhite("c7")).isFalse();
	}
}
