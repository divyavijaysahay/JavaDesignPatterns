package divyavijay.DesignPatterns.Creational.Builder;

import java.util.List;

/**
 * @Date : Oct 9, 2019
 *
 * @Author: Divyavijay Sahay  
 */

public class House {

	private List<BedRoom> bedRooms;

	public House(List<BedRoom> bedRooms) {
		super();
		this.bedRooms = bedRooms;
	}

	@Override
	public String toString() {
		return this.bedRooms.toString();
	}
}
