package divyavijay.DesignPatterns.Behavioral.strategy;

import divyavijay.DesignPatterns.Behavioral.strategy.Navigator.RouteStrategy;

/**
 * @Date : Oct 23, 2019
 *
 * @Author: Divyavijay Sahay  
 */

public class Client {

	public static void main(String[] args) {
		RouteStrategy carStrategy = new CarStrategy();
		RouteStrategy bikeStrategy = new BikeStrategy();
		Navigator navigator = new Navigator();
		
		navigator.setRouteStrategy(carStrategy);
		System.out.println(navigator.buildRoute("BOS", "NY"));
		
		navigator.setRouteStrategy(bikeStrategy);
		System.out.println(navigator.buildRoute("BOS", "NY"));
	}
	
}
