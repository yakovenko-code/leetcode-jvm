package code.yakovenko.leetcode.easy;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

public final class DecodeTheMessageTest {

	private final DecodeTheMessage solution = new DecodeTheMessage();

	@Test
	public void example1() {
		assertThat(
				solution.decodeMessage("the quick brown fox jumps over the lazy dog", "vkbs bs t suepuv")
		).isEqualTo("this is a secret");
	}

	@Test
	public void example2() {
		assertThat(
				solution.decodeMessage("eljuxhpwnyrdgtqkviszcfmabo", "zwx hnfx lqantp mnoeius ycgk vcnjrdb")
		).isEqualTo("the five boxing wizards jump quickly");
	}
}
