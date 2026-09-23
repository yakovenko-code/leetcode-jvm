package code.yakovenko.leetcode.java.easy;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

public final class P0557ReverseWordsInAStringIIITest {

	private final P0557ReverseWordsInAStringIII solution = new P0557ReverseWordsInAStringIII();

	@Test
	public void example1() {
		assertThat(solution.reverseWords("Let's take LeetCode contest"))
				.isEqualTo("s'teL ekat edoCteeL tsetnoc");
	}

	@Test
	public void example2() {
		assertThat(solution.reverseWords("Mr Ding")).isEqualTo("rM gniD");
	}
}
