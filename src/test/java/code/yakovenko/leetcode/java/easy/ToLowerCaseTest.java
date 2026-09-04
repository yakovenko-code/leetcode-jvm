package code.yakovenko.leetcode.java.easy;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

public final class ToLowerCaseTest {

	private final ToLowerCase solution = new ToLowerCase();

	@Test
	public void example1() {
		assertThat(solution.toLowerCase("Hello")).isEqualTo("hello");
	}

	@Test
	public void example2() {
		assertThat(solution.toLowerCase("here")).isEqualTo("here");
	}

	@Test
	public void example3() {
		assertThat(solution.toLowerCase("LOVELY")).isEqualTo("lovely");
	}
}
