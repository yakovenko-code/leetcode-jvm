package code.yakovenko.leetcode.easy;

import org.junit.jupiter.api.Test;

import java.util.List;

import static org.assertj.core.api.Assertions.assertThat;

public final class ToggleLightBulbsTest {

	private final ToggleLightBulbs solution = new ToggleLightBulbs();

	@Test
	public void example1() {
		assertThat(solution.toggleLightBulbs(List.of(10, 30, 20, 10))).isEqualTo(List.of(20, 30));
	}

	@Test
	public void example2() {
		assertThat(solution.toggleLightBulbs(List.of(100, 100))).isEqualTo(List.of());
	}
}
