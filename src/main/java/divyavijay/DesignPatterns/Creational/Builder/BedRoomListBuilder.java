package divyavijay.DesignPatterns.Creational.Builder;

import java.util.ArrayList;
import java.util.List;

/**
 * @Date : Oct 9, 2019
 *
 * @Author: Divyavijay Sahay
 */

public class BedRoomListBuilder {

	private List<BedRoom> bedRooms;

	public BedRoomListBuilder() {
	}

	public BedRoomListBuilder addList() {
		this.bedRooms = new ArrayList<BedRoom>();
		return this;
	}
	
	public List<BedRoom> buildList() {
		return this.bedRooms;
	}
	
	public BedRoomListBuilder addBedRoom(BedRoom bedRoom) {
		this.bedRooms.add(bedRoom);
		return this;
	}
	
	public BedRoomBuilder addBedRoom() {
		return new BedRoomBuilder(this);
	}

}
