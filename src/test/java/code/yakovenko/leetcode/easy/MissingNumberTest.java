package code.yakovenko.leetcode.easy;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

public final class MissingNumberTest {

	private final MissingNumber solution = new MissingNumber();

	@Test
	public void test1() {
		assertThat(solution.missingNumber(new int[]{3, 0, 1})).isEqualTo(2);
	}

	@Test
	public void test2() {
		assertThat(solution.missingNumber(new int[]{0, 1})).isEqualTo(2);
	}

	@Test
	public void test3() {
		assertThat(solution.missingNumber(new int[]{9, 6, 4, 2, 3, 5, 7, 0, 1})).isEqualTo(8);
	}
}
