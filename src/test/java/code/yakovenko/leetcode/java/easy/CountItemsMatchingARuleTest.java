package code.yakovenko.leetcode.java.easy;

import org.junit.jupiter.api.Test;

import java.util.List;

import static org.assertj.core.api.Assertions.assertThat;

public final class CountItemsMatchingARuleTest {

	private final CountItemsMatchingARule solution = new CountItemsMatchingARule();

	@Test
	public void example1() {
		assertThat(solution.countMatches(
				List.of(
						List.of("phone", "blue", "pixel"),
						List.of("computer", "silver", "lenovo"),
						List.of("phone", "gold", "iphone")
				),
				"color",
				"silver"
		)).isEqualTo(1);
	}

	@Test
	public void example2() {
		assertThat(solution.countMatches(
				List.of(
						List.of("phone", "blue", "pixel"),
						List.of("computer", "silver", "phone"),
						List.of("phone", "gold", "iphone")
				),
				"type",
				"phone"
		)).isEqualTo(2);
	}
}
