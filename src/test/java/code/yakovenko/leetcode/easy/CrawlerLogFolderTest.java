package code.yakovenko.leetcode.easy;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

public final class CrawlerLogFolderTest {

	private final CrawlerLogFolder solution = new CrawlerLogFolder();

	@Test
	public void example1() {
		assertThat(solution.minOperations(new String[]{"d1/", "d2/", "../", "d21/", "./"})).isEqualTo(2);
	}

	@Test
	public void example2() {
		assertThat(solution.minOperations(new String[]{"d1/", "d2/", "./", "d3/", "../", "d31/"})).isEqualTo(3);
	}

	@Test
	public void example3() {
		assertThat(solution.minOperations(new String[]{"d1/", "../", "../", "../"})).isEqualTo(0);
	}
}
