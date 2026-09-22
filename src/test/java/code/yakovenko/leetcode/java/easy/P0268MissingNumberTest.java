package code.yakovenko.leetcode.java.easy;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

public final class P0268MissingNumberTest {

	private final P0268MissingNumber solution = new P0268MissingNumber();

	@Test
	public void example1() {
		assertThat(solution.missingNumber(new int[]{3, 0, 1})).isEqualTo(2);
	}

	@Test
	public void example2() {
		assertThat(solution.missingNumber(new int[]{0, 1})).isEqualTo(2);
	}

	@Test
	public void example3() {
		assertThat(solution.missingNumber(new int[]{9, 6, 4, 2, 3, 5, 7, 0, 1})).isEqualTo(8);
	}
}
