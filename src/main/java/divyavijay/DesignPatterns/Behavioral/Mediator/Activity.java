package divyavijay.DesignPatterns.Behavioral.Mediator;

import divyavijay.DesignPatterns.Behavioral.Mediator.widgets.Button;
import divyavijay.DesignPatterns.Behavioral.Mediator.widgets.CheckBox;

/**
 * @Date : Oct 22, 2019
 *
 * @Author: Divyavijay Sahay  
 */

public class Activity implements OnClickListener {

	// Public variables for testing.
	public Button selectAll, selectFirst;
	public CheckBox checkBox1, checkBox2, checkBox3;
	
	public Activity() {
		create();
	}
	
	private void create() {
		selectAll = new Button("Select All");
		selectFirst = new Button("Select First Check Box");
		
		checkBox1 = new CheckBox("CB1");
		checkBox2 = new CheckBox("CB2");
		checkBox3 = new CheckBox("CB3");
		
		selectAll.setOnClickListener(this);
		selectFirst.setOnClickListener(this);
		checkBox1.setOnClickListener(this);
	}
	
	
	@Override
	public void onClick(String elementId) {
		if(elementId.equals(this.selectAll.getId())) {
			System.out.println(this.selectAll.getName() + " clicked.");
			selectAllCheckBox();
		} else if(elementId.equals(this.selectFirst.getId())) {
			System.out.println(this.selectFirst.getName() + " clicked.");
			selectCheckBox(this.checkBox1);
		} else if(elementId.equals(this.checkBox1.getId())) {
			System.out.println(this.checkBox1.getName() + " clicked.");
		} else {
			// Unknown click.
			System.out.println("unkown element clicked.");
		}
	}


	private void selectCheckBox(CheckBox checkBox) {
		checkBox.select();
	}


	private void selectAllCheckBox() {
		selectCheckBox(checkBox1);
		selectCheckBox(checkBox2);
		selectCheckBox(checkBox3);
	}
	
	public void printCheckBoxStatus() {
		status(checkBox1);
		status(checkBox2);
		status(checkBox3);		
	}


	private void status(CheckBox checkBox) {
		System.out.println(checkBox.getName() + " " + checkBox.isSelected());
	}

}
