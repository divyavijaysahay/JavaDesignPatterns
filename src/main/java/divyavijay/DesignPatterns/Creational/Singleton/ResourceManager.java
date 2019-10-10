package divyavijay.DesignPatterns.Creational.Singleton;

/**
 * @Date : Oct 9, 2019
 *
 * @Author: Divyavijay Sahay  
 */

public class ResourceManager {

	public static void main(String[] args) {
		PrinterScheduler printerScheduler = PrinterScheduler.getInstance();
		PrinterScheduler printerScheduler2 = PrinterScheduler.getInstance();
		System.out.println(printerScheduler == printerScheduler2);
		System.out.println(printerScheduler.equals(printerScheduler2));
		System.out.println(printerScheduler.hashCode());
		System.out.println(printerScheduler2.hashCode());
	}
	
}
