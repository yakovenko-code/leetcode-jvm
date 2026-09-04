package code.yakovenko.leetcode.java.easy;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

public final class GenerateTagForVideoCaptionTest {

	private final GenerateTagForVideoCaption solution = new GenerateTagForVideoCaption();

	@Test
	public void example1() {
		assertThat(solution.generateTag("Leetcode daily streak achieved"))
				.isEqualTo("#leetcodeDailyStreakAchieved");
	}

	@Test
	public void example2() {
		assertThat(solution.generateTag("can I Go There"))
				.isEqualTo("#canIGoThere");
	}

	@Test
	public void example3() {
		assertThat(solution.generateTag("h".repeat(101))).isEqualTo("#" + "h".repeat(99));
	}
}
