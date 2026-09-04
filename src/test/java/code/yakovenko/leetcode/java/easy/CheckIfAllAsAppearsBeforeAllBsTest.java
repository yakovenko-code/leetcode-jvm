package code.yakovenko.leetcode.java.easy;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

public final class CheckIfAllAsAppearsBeforeAllBsTest {

	private final CheckIfAllAsAppearsBeforeAllBs solution = new CheckIfAllAsAppearsBeforeAllBs();

	@Test
	public void example1() {
		assertThat(solution.checkString("aaabbb")).isTrue();
	}

	@Test
	public void example2() {
		assertThat(solution.checkString("abab")).isFalse();
	}

	@Test
	public void example3() {
		assertThat(solution.checkString("bbb")).isTrue();
	}
}
