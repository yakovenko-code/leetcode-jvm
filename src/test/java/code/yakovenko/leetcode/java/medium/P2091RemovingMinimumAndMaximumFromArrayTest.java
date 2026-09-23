package code.yakovenko.leetcode.java.medium;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

public final class P2091RemovingMinimumAndMaximumFromArrayTest {

	private final P2091RemovingMinimumAndMaximumFromArray solution = new P2091RemovingMinimumAndMaximumFromArray();

	@Test
	public void example1() {
		assertThat(solution.minimumDeletions(new int[]{2, 10, 7, 5, 4, 1, 8, 6})).isEqualTo(5);
	}

	@Test
	public void example2() {
		assertThat(solution.minimumDeletions(new int[]{0, -4, 19, 1, 8, -2, -3, 5})).isEqualTo(3);
	}

	@Test
	public void example3() {
		assertThat(solution.minimumDeletions(new int[]{101})).isEqualTo(1);
	}
}
