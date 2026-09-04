package code.yakovenko.leetcode.java.easy;

import org.junit.jupiter.api.Test;

import java.util.List;

import static org.assertj.core.api.Assertions.assertThat;

public final class CouponCodeValidatorTest {

	private final CouponCodeValidator solution = new CouponCodeValidator();

	@Test
	public void example1() {
		assertThat(
				solution.validateCoupons(
						new String[]{"SAVE20", "", "PHARMA5", "SAVE@20"},
						new String[]{"restaurant", "grocery", "pharmacy", "restaurant"},
						new boolean[]{true, true, true, true}
				)
		).isEqualTo(List.of("PHARMA5", "SAVE20"));
	}

	@Test
	public void example2() {
		assertThat(
				solution.validateCoupons(
						new String[]{"GROCERY15", "ELECTRONICS_50", "DISCOUNT10"},
						new String[]{"grocery", "electronics", "invalid"},
						new boolean[]{false, true, true}
				)
		).isEqualTo(List.of("ELECTRONICS_50"));
	}
}
