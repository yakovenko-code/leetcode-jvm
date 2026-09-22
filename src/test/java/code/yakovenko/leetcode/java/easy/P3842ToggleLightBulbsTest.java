package code.yakovenko.leetcode.java.easy;

import org.junit.jupiter.api.Test;

import java.util.List;

import static org.assertj.core.api.Assertions.assertThat;

public final class P3842ToggleLightBulbsTest {

	private final P3842ToggleLightBulbs solution = new P3842ToggleLightBulbs();

	@Test
	public void example1() {
		assertThat(solution.toggleLightBulbs(List.of(10, 30, 20, 10))).isEqualTo(List.of(20, 30));
	}

	@Test
	public void example2() {
		assertThat(solution.toggleLightBulbs(List.of(100, 100))).isEqualTo(List.of());
	}
}
