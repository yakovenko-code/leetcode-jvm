package code.yakovenko.leetcode.easy;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

public final class DecompressRunLengthEncodedListTest {

	private final DecompressRunLengthEncodedList solution = new DecompressRunLengthEncodedList();

	@Test
	public void test1() {
		assertThat(solution.decompressRLElist(new int[]{1, 2, 3, 4})).isEqualTo(new int[]{2, 4, 4, 4});
	}

	@Test
	public void test2() {
		assertThat(solution.decompressRLElist(new int[]{1, 1, 2, 3})).isEqualTo(new int[]{1, 3, 3});
	}
}
