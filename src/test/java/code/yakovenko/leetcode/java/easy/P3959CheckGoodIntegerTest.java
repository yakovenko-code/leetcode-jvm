package code.yakovenko.leetcode.java.easy;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

public final class P3959CheckGoodIntegerTest {

	private final P3959CheckGoodInteger solution = new P3959CheckGoodInteger();

	@Test
	public void example1() {
		assertThat(solution.checkGoodInteger(1000)).isFalse();
	}

	@Test
	public void example2() {
		assertThat(solution.checkGoodInteger(19)).isTrue();
	}
}
