package code.yakovenko.leetcode.java.easy;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

public final class P3270FindTheKeyOfTheNumbersTest {

	private final P3270FindTheKeyOfTheNumbers solution = new P3270FindTheKeyOfTheNumbers();

	@Test
	public void example1() {
		assertThat(solution.generateKey(1, 10, 1000)).isEqualTo(0);
	}

	@Test
	public void example2() {
		assertThat(solution.generateKey(987, 879, 798)).isEqualTo(777);
	}

	@Test
	public void example3() {
		assertThat(solution.generateKey(1, 2, 3)).isEqualTo(1);
	}
}
