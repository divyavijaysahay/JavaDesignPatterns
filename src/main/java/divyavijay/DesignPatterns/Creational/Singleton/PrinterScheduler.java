package divyavijay.DesignPatterns.Creational.Singleton;

/**
 * @Date : Oct 9, 2019
 *
 * @Author: Divyavijay Sahay
 */

public class PrinterScheduler {

	private static PrinterScheduler printerScheduler;
	private static boolean isInitialised = false;

	// Disallow the creation of object.
	private PrinterScheduler() {
	}

	/**
	 * Makes sure only one instance is created for this class. 
	 * <i>synchronized</i> makes sure only one thread can access this method at a time. 
	 * Thus avoids two threads accessing the method before one of them completes.
	 * 
	 */
	public static synchronized PrinterScheduler getInstance() {
		if (isInitialised)
			return printerScheduler;

		printerScheduler = new PrinterScheduler();
		isInitialised = true;
		return printerScheduler;
	}
}
