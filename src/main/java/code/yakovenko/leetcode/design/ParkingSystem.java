package code.yakovenko.leetcode.design;

public class ParkingSystem {

	private final int[] PARKING_LOTS = new int[3];

	public ParkingSystem(int big, int medium, int small) {
		PARKING_LOTS[0] = big;
		PARKING_LOTS[1] = medium;
		PARKING_LOTS[2] = small;
	}

	public boolean addCar(int carType) {
		return PARKING_LOTS[carType - 1]-- > 0;
	}
}
