package divyavijay.DesignPatterns.Behavioral.Mediator;

/**
 * @Date : Oct 22, 2019
 *
 * @Author: Divyavijay Sahay  
 */

public class Client {

	public static void main(String[] args) {
		Activity activity = new Activity();
		// Action 1
		activity.selectAll.click();
		activity.printCheckBoxStatus();
		System.out.println();
		
		// Action 2
		activity.selectFirst.click();
		activity.printCheckBoxStatus();
		System.out.println();
		
		// Action 3
		activity.checkBox1.click();
		activity.printCheckBoxStatus();
		System.out.println();
		
		// Action 4
		activity.selectAll.click();
		activity.printCheckBoxStatus();
		System.out.println();
	}
	
}
