package code.yakovenko.leetcode.java.easy;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

public final class P2469ConvertTheTemperatureTest {

	private final P2469ConvertTheTemperature solution = new P2469ConvertTheTemperature();

	@Test
	public void example1() {
		assertThat(solution.convertTemperature(36.50)).isEqualTo(new double[]{309.65000, 97.70000});
	}

	@Test
	public void example2() {
		assertThat(solution.convertTemperature(122.11)).isEqualTo(new double[]{395.26000, 251.79800});
	}
}
