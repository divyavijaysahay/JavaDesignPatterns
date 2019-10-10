package divyavijay.DesignPatterns.Creational.Builder;

/**
 * @Date : Oct 9, 2019
 *
 * @Author: Divyavijay Sahay
 */

public class BedRoomBuilder implements Builder {

	private int height;
	private int width;
	private int floorNumber;
	private String wallColor;
	private int numberOfWindows;
	private int numberOfDoors;
	private int numberOfBeds;
	private BedRoomListBuilder bedRoomListBuilder;
	
	
	public BedRoomBuilder() {
	}
	
	public BedRoomBuilder(BedRoomListBuilder listBuilder) {
		this.bedRoomListBuilder = listBuilder;
	}

	/* (non-Javadoc)
	 * @see divyavijay.DesignPatterns.Creational.Builder.Builder#setHeight(int)
	 */
	public BedRoomBuilder setHeight(int height) {
		this.height = height;
		return this;
	}

	/* (non-Javadoc)
	 * @see divyavijay.DesignPatterns.Creational.Builder.Builder#setWidth(int)
	 */
	public BedRoomBuilder setWidth(int width) {
		this.width = width;
		return this;
	}

	/* (non-Javadoc)
	 * @see divyavijay.DesignPatterns.Creational.Builder.Builder#setFloorNumber(int)
	 */
	public BedRoomBuilder setFloorNumber(int floorNumber) {
		this.floorNumber = floorNumber;
		return this;
	}

	/* (non-Javadoc)
	 * @see divyavijay.DesignPatterns.Creational.Builder.Builder#setWallColor(java.lang.String)
	 */
	public BedRoomBuilder setWallColor(String wallColor) {
		this.wallColor = wallColor;
		return this;
	}

	/* (non-Javadoc)
	 * @see divyavijay.DesignPatterns.Creational.Builder.Builder#setNumberOfWindows(int)
	 */
	public BedRoomBuilder setNumberOfWindows(int numberOfWindows) {
		this.numberOfWindows = numberOfWindows;
		return this;
	}

	/* (non-Javadoc)
	 * @see divyavijay.DesignPatterns.Creational.Builder.Builder#setNumberOfDoors(int)
	 */
	public BedRoomBuilder setNumberOfDoors(int numberOfDoors) {
		this.numberOfDoors = numberOfDoors;
		return this;
	}

	public BedRoomBuilder setNumberOfBeds(int numberOfBeds) {
		this.numberOfBeds = numberOfBeds;
		return this;
	}

	public BedRoom createBedRoom() {
		return new BedRoom(height, width, floorNumber, wallColor, numberOfWindows, numberOfDoors, numberOfBeds);
	}

	public BedRoomListBuilder addToList() {
		BedRoom bedRoom = createBedRoom();
		this.bedRoomListBuilder.addBedRoom(bedRoom);
		return this.bedRoomListBuilder;
	}
}
