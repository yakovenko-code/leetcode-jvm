package code.yakovenko.leetcode.java.easy;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

public final class P2678NumberOfSeniorCitizensTest {

	private final P2678NumberOfSeniorCitizens solution = new P2678NumberOfSeniorCitizens();

	@Test
	public void example1() {
		assertThat(solution.countSeniors(new String[]{"7868190130M7522", "5303914400F9211", "9273338290F4010"}))
				.isEqualTo(2);
	}

	@Test
	public void example2() {
		assertThat(solution.countSeniors(new String[]{"1313579440F2036", "2921522980M5644"}))
				.isEqualTo(0);
	}
}
