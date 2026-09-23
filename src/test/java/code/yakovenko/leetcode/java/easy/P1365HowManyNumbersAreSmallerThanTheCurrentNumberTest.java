package code.yakovenko.leetcode.java.easy;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

public final class P1365HowManyNumbersAreSmallerThanTheCurrentNumberTest {

	private final P1365HowManyNumbersAreSmallerThanTheCurrentNumber solution =
			new P1365HowManyNumbersAreSmallerThanTheCurrentNumber();

	@Test
	public void example1() {
		assertThat(solution.smallerNumbersThanCurrent(new int[]{8, 1, 2, 2, 3})).isEqualTo(new int[]{4, 0, 1, 1, 3});
	}

	@Test
	public void example2() {
		assertThat(solution.smallerNumbersThanCurrent(new int[]{6, 5, 4, 8})).isEqualTo(new int[]{2, 1, 0, 3});
	}

	@Test
	public void example3() {
		assertThat(solution.smallerNumbersThanCurrent(new int[]{7, 7, 7, 7})).isEqualTo(new int[]{0, 0, 0, 0});
	}
}
