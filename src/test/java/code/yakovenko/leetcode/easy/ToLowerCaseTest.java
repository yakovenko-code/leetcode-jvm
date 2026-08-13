package code.yakovenko.leetcode.easy;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

public final class ToLowerCaseTest {

	private final ToLowerCase solution = new ToLowerCase();

	@Test
	public void test1() {
		assertThat(solution.toLowerCase("Hello")).isEqualTo("hello");
	}

	@Test
	public void test2() {
		assertThat(solution.toLowerCase("here")).isEqualTo("here");
	}

	@Test
	public void test3() {
		assertThat(solution.toLowerCase("LOVELY")).isEqualTo("lovely");
	}
}
