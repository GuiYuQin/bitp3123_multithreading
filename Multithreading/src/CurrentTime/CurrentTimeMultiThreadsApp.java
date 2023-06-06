package CurrentTime;



/**
 * This class demonstrate the application of multiple threads object in
 * a simple Java multithreaded application
 *
 * @author emalianakasmuri
 *
 */
public class CurrentTimeMultiThreadsApp {

	public static void main(String[] args) {

		// Create thread objects
		Thread currentTimeThread1 = new CurrentTimeTask();
		Thread currentTimeThread2 = new CurrentTimeTask();

		currentTimeThread1.setName("currentTimeThreadOne");	
		// Execute threads
		currentTimeThread2.start();
		currentTimeThread1.start();

		System.out.println("Program ends");

	}

}
