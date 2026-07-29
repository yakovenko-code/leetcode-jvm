package code.yakovenko.leetcode.easy;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

public final class FindTheEncryptedStringTest {

	private final FindTheEncryptedString solution = new FindTheEncryptedString();

	@Test
	public void test1() {
		assertThat(solution.getEncryptedString("dart", 3)).isEqualTo("tdar");
	}

	@Test
	public void test2() {
		assertThat(solution.getEncryptedString("aaa", 1)).isEqualTo("aaa");
	}
}
