package code.yakovenko.leetcode.java.easy;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

public final class StrongPasswordCheckerIITest {

	private final StrongPasswordCheckerII solution = new StrongPasswordCheckerII();

	@Test
	public void example1() {
		assertThat(solution.strongPasswordCheckerII("IloveLe3tcode!")).isTrue();
	}

	@Test
	public void example2() {
		assertThat(solution.strongPasswordCheckerII("Me+You--IsMyDream")).isFalse();
	}

	@Test
	public void example3() {
		assertThat(solution.strongPasswordCheckerII("1aB!")).isFalse();
	}
}
