package code.yakovenko.leetcode.easy;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

public final class GenerateTagForVideoCaptionTest {

	private final GenerateTagForVideoCaption solution = new GenerateTagForVideoCaption();

	@Test
	public void test1() {
		assertThat(solution.generateTag("Leetcode daily streak achieved"))
				.isEqualTo("#leetcodeDailyStreakAchieved");
	}

	@Test
	public void test2() {
		assertThat(solution.generateTag("can I Go There"))
				.isEqualTo("#canIGoThere");
	}

	@Test
	public void test3() {
		assertThat(solution.generateTag("h".repeat(101))).isEqualTo("#" + "h".repeat(99));
	}
}
