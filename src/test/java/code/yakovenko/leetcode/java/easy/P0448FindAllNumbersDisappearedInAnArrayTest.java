package code.yakovenko.leetcode.java.easy;

import org.junit.jupiter.api.Test;

import java.util.List;

import static org.assertj.core.api.Assertions.assertThat;

public final class P0448FindAllNumbersDisappearedInAnArrayTest {

	private final P0448FindAllNumbersDisappearedInAnArray solution = new P0448FindAllNumbersDisappearedInAnArray();

	@Test
	public void example1() {
		assertThat(solution.findDisappearedNumbers(new int[]{4, 3, 2, 7, 8, 2, 3, 1})).isEqualTo(List.of(5, 6));
	}

	@Test
	public void example2() {
		assertThat(solution.findDisappearedNumbers(new int[]{1, 1})).isEqualTo(List.of(2));
	}
}
