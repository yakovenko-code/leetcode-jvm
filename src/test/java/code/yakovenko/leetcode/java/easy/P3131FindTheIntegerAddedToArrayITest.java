package code.yakovenko.leetcode.java.easy;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

public final class P3131FindTheIntegerAddedToArrayITest {

	private final P3131FindTheIntegerAddedToArrayI solution = new P3131FindTheIntegerAddedToArrayI();

	@Test
	public void example1() {
		assertThat(solution.addedInteger(new int[]{2, 6, 4}, new int[]{9, 7, 5})).isEqualTo(3);
	}

	@Test
	public void example2() {
		assertThat(solution.addedInteger(new int[]{10}, new int[]{5})).isEqualTo(-5);
	}

	@Test
	public void example3() {
		assertThat(solution.addedInteger(new int[]{1, 1, 1, 1}, new int[]{1, 1, 1, 1})).isEqualTo(0);
	}
}
