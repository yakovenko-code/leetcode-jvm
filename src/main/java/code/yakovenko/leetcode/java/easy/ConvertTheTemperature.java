package code.yakovenko.leetcode.java.easy;

public final class ConvertTheTemperature {

	public double[] convertTemperature(double celsius) {
		return new double[]{celsius + 273.15, celsius * 1.8 + 32};
	}
}
