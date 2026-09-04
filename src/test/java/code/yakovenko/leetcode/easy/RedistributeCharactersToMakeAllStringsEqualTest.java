package code.yakovenko.leetcode.easy;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

public final class RedistributeCharactersToMakeAllStringsEqualTest {

	private final RedistributeCharactersToMakeAllStringsEqual solution =
			new RedistributeCharactersToMakeAllStringsEqual();

	@Test
	public void example1() {
		assertThat(solution.makeEqual(new String[]{"abc", "aabc", "bc"})).isTrue();
	}

	@Test
	public void example2() {
		assertThat(solution.makeEqual(new String[]{"ab", "a"})).isFalse();
	}
}
