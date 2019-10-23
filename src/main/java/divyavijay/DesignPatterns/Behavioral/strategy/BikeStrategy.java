package divyavijay.DesignPatterns.Behavioral.strategy;

import divyavijay.DesignPatterns.Behavioral.strategy.Navigator.RouteStrategy;

/**
 * @Date : Oct 23, 2019
 *
 * @Author: Divyavijay Sahay  
 */

public class BikeStrategy implements RouteStrategy {

	@Override
	public String buildRoute(String src, String dst) {
		return "Route for bike between " + src + " and " + dst;
	}
}
