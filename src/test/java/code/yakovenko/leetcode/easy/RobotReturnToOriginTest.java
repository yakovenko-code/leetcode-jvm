package code.yakovenko.leetcode.easy;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

public final class RobotReturnToOriginTest {

	private final RobotReturnToOrigin solution = new RobotReturnToOrigin();

	@Test
	public void example1() {
		assertThat(solution.judgeCircle("UD")).isTrue();
	}

	@Test
	public void example2() {
		assertThat(solution.judgeCircle("LL")).isFalse();
	}
}
