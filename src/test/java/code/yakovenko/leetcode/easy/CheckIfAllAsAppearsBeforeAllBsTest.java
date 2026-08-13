package code.yakovenko.leetcode.easy;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

public final class CheckIfAllAsAppearsBeforeAllBsTest {

	private final CheckIfAllAsAppearsBeforeAllBs solution = new CheckIfAllAsAppearsBeforeAllBs();

	@Test
	public void test1() {
		assertThat(solution.checkString("aaabbb")).isTrue();
	}

	@Test
	public void test2() {
		assertThat(solution.checkString("abab")).isFalse();
	}

	@Test
	public void test3() {
		assertThat(solution.checkString("bbb")).isTrue();
	}
}
