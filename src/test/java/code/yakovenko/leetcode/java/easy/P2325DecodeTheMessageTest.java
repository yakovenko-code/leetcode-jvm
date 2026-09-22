package code.yakovenko.leetcode.java.easy;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

public final class P2325DecodeTheMessageTest {

	private final P2325DecodeTheMessage solution = new P2325DecodeTheMessage();

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
