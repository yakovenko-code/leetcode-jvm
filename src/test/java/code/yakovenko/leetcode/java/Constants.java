package code.yakovenko.leetcode.java;

import org.assertj.core.data.Offset;

public final class Constants {

	public static final Offset<Double> TOLERANCE = Offset.offset(1e-9);

	private Constants() {
		throw new AssertionError("No Constants instances for you!");
	}
}
