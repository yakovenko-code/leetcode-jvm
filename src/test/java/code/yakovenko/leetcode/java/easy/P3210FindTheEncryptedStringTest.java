package code.yakovenko.leetcode.java.easy;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

public final class P3210FindTheEncryptedStringTest {

	private final P3210FindTheEncryptedString solution = new P3210FindTheEncryptedString();

	@Test
	public void example1() {
		assertThat(solution.getEncryptedString("dart", 3)).isEqualTo("tdar");
	}

	@Test
	public void example2() {
		assertThat(solution.getEncryptedString("aaa", 1)).isEqualTo("aaa");
	}
}
