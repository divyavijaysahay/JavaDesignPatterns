package divyavijay.DesignPatterns.Creational.Builder;

/**
 * @Date : Oct 9, 2019
 *
 * @Author: Divyavijay Sahay  
 */

public interface Builder {

	Builder setHeight(int height);

	Builder setWidth(int width);

	Builder setFloorNumber(int floorNumber);

	Builder setWallColor(String wallColor);

	Builder setNumberOfWindows(int numberOfWindows);

	Builder setNumberOfDoors(int numberOfDoors);

}