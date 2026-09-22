package code.yakovenko.leetcode.java.easy;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

public final class P1897RedistributeCharactersToMakeAllStringsEqualTest {

	private final P1897RedistributeCharactersToMakeAllStringsEqual solution =
			new P1897RedistributeCharactersToMakeAllStringsEqual();

	@Test
	public void example1() {
		assertThat(solution.makeEqual(new String[]{"abc", "aabc", "bc"})).isTrue();
	}

	@Test
	public void example2() {
		assertThat(solution.makeEqual(new String[]{"ab", "a"})).isFalse();
	}
}
