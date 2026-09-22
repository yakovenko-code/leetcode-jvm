package code.yakovenko.leetcode.java.easy;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

public final class P3783MirrorDistanceOfAnIntegerTest {

	private final P3783MirrorDistanceOfAnInteger solution = new P3783MirrorDistanceOfAnInteger();

	@Test
	public void example1() {
		assertThat(solution.mirrorDistance(25)).isEqualTo(27);
	}

	@Test
	public void example2() {
		assertThat(solution.mirrorDistance(10)).isEqualTo(9);
	}

	@Test
	public void example3() {
		assertThat(solution.mirrorDistance(7)).isEqualTo(0);
	}
}
