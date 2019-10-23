package divyavijay.DesignPatterns.Behavioral.strategy;

/**
 * @Date : Oct 23, 2019
 *
 * @Author: Divyavijay Sahay  
 */

public class Navigator {

	private RouteStrategy routeStrategy;
	
	public interface RouteStrategy {
		public String buildRoute(String src, String dst);
	}
	
	
	public void setRouteStrategy(RouteStrategy routeStrategy) {
		this.routeStrategy = routeStrategy;
	}
	
	public String buildRoute(String src, String dst) {
		return routeStrategy.buildRoute(src, dst);
	}
}
