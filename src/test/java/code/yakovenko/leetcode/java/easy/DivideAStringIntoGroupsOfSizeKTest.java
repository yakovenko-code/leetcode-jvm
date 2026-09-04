package code.yakovenko.leetcode.java.easy;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

public final class DivideAStringIntoGroupsOfSizeKTest {

	private final DivideAStringIntoGroupsOfSizeK solution = new DivideAStringIntoGroupsOfSizeK();

	@Test
	public void example1() {
		assertThat(solution.divideString("abcdefghi", 3, 'x')).isEqualTo(new String[]{"abc", "def", "ghi"});
	}

	@Test
	public void example2() {
		assertThat(solution.divideString("abcdefghij", 3, 'x'))
				.isEqualTo(new String[]{"abc", "def", "ghi", "jxx"});
	}
}
