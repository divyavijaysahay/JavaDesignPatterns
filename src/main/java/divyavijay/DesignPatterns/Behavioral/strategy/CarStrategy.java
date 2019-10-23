package divyavijay.DesignPatterns.Behavioral.strategy;

import divyavijay.DesignPatterns.Behavioral.strategy.Navigator.RouteStrategy;

/**
 * @Date : Oct 23, 2019
 *
 * @Author: Divyavijay Sahay  
 */

public class CarStrategy implements RouteStrategy {

	@Override
	public String buildRoute(String src, String dst) {
		return "Route for car between " + src + " and " + dst;
	}

}
