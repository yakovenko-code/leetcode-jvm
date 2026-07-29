package code.yakovenko.leetcode.easy;

public final class TrafficSignalColor {

	public String trafficSignal(int timer) {
		if (timer == 0) return "Green";
		if (timer == 30) return "Orange";
		if (30 < timer && timer <= 90) return "Red";
		return "Invalid";
	}
}
