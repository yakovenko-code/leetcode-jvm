package code.yakovenko.leetcode.java.easy;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

public final class P0657RobotReturnToOriginTest {

	private final P0657RobotReturnToOrigin solution = new P0657RobotReturnToOrigin();

	@Test
	public void example1() {
		assertThat(solution.judgeCircle("UD")).isTrue();
	}

	@Test
	public void example2() {
		assertThat(solution.judgeCircle("LL")).isFalse();
	}
}
