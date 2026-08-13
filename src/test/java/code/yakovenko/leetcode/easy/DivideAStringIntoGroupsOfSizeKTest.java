package code.yakovenko.leetcode.easy;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

public final class DivideAStringIntoGroupsOfSizeKTest {

	private final DivideAStringIntoGroupsOfSizeK solution = new DivideAStringIntoGroupsOfSizeK();

	@Test
	public void test1() {
		assertThat(solution.divideString("abcdefghi", 3, 'x')).isEqualTo(new String[]{"abc", "def", "ghi"});
	}

	@Test
	public void test2() {
		assertThat(solution.divideString("abcdefghij", 3, 'x'))
				.isEqualTo(new String[]{"abc", "def", "ghi", "jxx"});
	}
}
