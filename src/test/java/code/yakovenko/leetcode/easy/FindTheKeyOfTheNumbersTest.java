package code.yakovenko.leetcode.easy;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

public final class FindTheKeyOfTheNumbersTest {

	private final FindTheKeyOfTheNumbers solution = new FindTheKeyOfTheNumbers();

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
