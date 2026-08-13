package code.yakovenko.leetcode.easy;

import org.junit.jupiter.api.Test;

import java.util.List;

import static org.assertj.core.api.Assertions.assertThat;

public final class FindMissingElementsTest {

	private final FindMissingElements solution = new FindMissingElements();

	@Test
	public void test1() {
		assertThat(solution.findMissingElements(new int[]{1, 4, 2, 5})).isEqualTo(List.of(3));
	}

	@Test
	public void test2() {
		assertThat(solution.findMissingElements(new int[]{7, 8, 6, 9})).isEqualTo(List.of());
	}

	@Test
	public void test3() {
		assertThat(solution.findMissingElements(new int[]{5, 1})).isEqualTo(List.of(2, 3, 4));
	}
}
