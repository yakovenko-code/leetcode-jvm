package code.yakovenko.leetcode.java.easy;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

public final class P1313DecompressRunLengthEncodedListTest {

	private final P1313DecompressRunLengthEncodedList solution = new P1313DecompressRunLengthEncodedList();

	@Test
	public void example1() {
		assertThat(solution.decompressRLElist(new int[]{1, 2, 3, 4})).isEqualTo(new int[]{2, 4, 4, 4});
	}

	@Test
	public void example2() {
		assertThat(solution.decompressRLElist(new int[]{1, 1, 2, 3})).isEqualTo(new int[]{1, 3, 3});
	}
}
