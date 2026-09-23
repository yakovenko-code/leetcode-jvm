package code.yakovenko.leetcode.java.easy;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

public final class P0387FirstUniqueCharacterInAStringTest {

	private final P0387FirstUniqueCharacterInAString solution = new P0387FirstUniqueCharacterInAString();

	@Test
	public void example1() {
		assertThat(solution.firstUniqChar("leetcode")).isEqualTo(0);
	}

	@Test
	public void example2() {
		assertThat(solution.firstUniqChar("loveleetcode")).isEqualTo(2);
	}

	@Test
	public void example3() {
		assertThat(solution.firstUniqChar("aabb")).isEqualTo(-1);
	}
}
