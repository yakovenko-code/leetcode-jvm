package code.yakovenko.leetcode.java.easy;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

public final class ReverseDegreeOfAStringTest {

	private final ReverseDegreeOfAString solution = new ReverseDegreeOfAString();

	@Test
	public void example1() {
		assertThat(solution.reverseDegree("abc")).isEqualTo(148);
	}

	@Test
	public void example2() {
		assertThat(solution.reverseDegree("zaza")).isEqualTo(160);
	}
}
