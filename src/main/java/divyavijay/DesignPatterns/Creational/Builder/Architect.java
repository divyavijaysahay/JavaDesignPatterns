package divyavijay.DesignPatterns.Creational.Builder;

import java.util.List;

/**
 * @Date : Oct 9, 2019
 *
 * @Author: Divyavijay Sahay  
 */

public class Architect {

	public static void main(String[] args) {
		// Without Builder
		BedRoom bedRoom = new BedRoom(100, 50, 2, "RED", 2, 1, 2);
		
		// With BedroomBuilder
		BedRoom bedRoom2 = new BedRoomBuilder()
							.setHeight(100)
							.setWidth(50)
							.setFloorNumber(2)
							.setWallColor("RED")
							.setNumberOfWindows(2)
							.setNumberOfDoors(1)
							.createBedRoom();
		
		// Complex builders
		List<BedRoom> bedRooms = new BedRoomListBuilder().addList()
									.addBedRoom().setHeight(100).setWidth(50).addToList()
									.addBedRoom().setHeight(200).setWidth(150).setWallColor("YELLOW").addToList()
									.buildList();
		
		House house = new House(bedRooms);
		
		
		System.out.println(bedRoom);
		System.out.println(bedRoom2);
		System.out.println(house);
	}
	
}
