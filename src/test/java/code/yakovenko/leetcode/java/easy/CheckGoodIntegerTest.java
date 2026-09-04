package code.yakovenko.leetcode.java.easy;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

public final class CheckGoodIntegerTest {

	private final CheckGoodInteger solution = new CheckGoodInteger();

	@Test
	public void example1() {
		assertThat(solution.checkGoodInteger(1000)).isFalse();
	}

	@Test
	public void example2() {
		assertThat(solution.checkGoodInteger(19)).isTrue();
	}
}
