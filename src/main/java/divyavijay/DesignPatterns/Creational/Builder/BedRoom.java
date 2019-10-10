package divyavijay.DesignPatterns.Creational.Builder;

/**
 * @Date : Oct 9, 2019
 *
 * @Author: Divyavijay Sahay
 */

public class BedRoom {

	private int height;
	private int width;
	private int floorNumber;
	private String wallColor;
	private int numberOfWindows;
	private int numberOfDoors;
	private int numberOfBeds;

	public BedRoom(int height, int width, int floorNumber, String wallColor, int numberOfWindows, int numberOfDoors,
			int numberOfBeds) {
		super();
		this.height = height;
		this.width = width;
		this.floorNumber = floorNumber;
		this.wallColor = wallColor;
		this.numberOfWindows = numberOfWindows;
		this.numberOfDoors = numberOfDoors;
		this.numberOfBeds = numberOfBeds;
	}

	@Override
	public String toString() {
		return height + " " + width + " " + floorNumber + " " + wallColor + " " + numberOfWindows + " " + numberOfDoors
				+ " " + numberOfBeds;
	}

}
