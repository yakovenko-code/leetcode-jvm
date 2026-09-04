package code.yakovenko.leetcode.java.easy;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

public final class ContainsDuplicateTest {

	private final ContainsDuplicate solution = new ContainsDuplicate();

	@Test
	public void example1() {
		assertThat(solution.containsDuplicate(new int[]{1, 2, 3, 1})).isTrue();
	}

	@Test
	public void example2() {
		assertThat(solution.containsDuplicate(new int[]{1, 2, 3, 4})).isFalse();
	}

	@Test
	public void example3() {
		assertThat(solution.containsDuplicate(new int[]{1, 1, 1, 3, 3, 4, 3, 2, 4, 2})).isTrue();
	}
}
