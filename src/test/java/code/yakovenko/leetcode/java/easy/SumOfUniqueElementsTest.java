package code.yakovenko.leetcode.java.easy;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

public final class SumOfUniqueElementsTest {

	private final SumOfUniqueElements solution = new SumOfUniqueElements();

	@Test
	public void example1() {
		assertThat(solution.sumOfUnique(new int[]{1, 2, 3, 2})).isEqualTo(4);
	}

	@Test
	public void example2() {
		assertThat(solution.sumOfUnique(new int[]{1, 1, 1, 1, 1})).isEqualTo(0);
	}

	@Test
	public void example3() {
		assertThat(solution.sumOfUnique(new int[]{1, 2, 3, 4, 5})).isEqualTo(15);
	}
}
