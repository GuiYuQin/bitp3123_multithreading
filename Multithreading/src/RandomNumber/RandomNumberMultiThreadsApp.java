package RandomNumber;


/**
 * This class demonstrate execution of multiple threads object
 * from the same class.
 *
 * @author emalianakasmuri
 *
 */
public class RandomNumberMultiThreadsApp {

	public static void main(String[] args) {

		// Create Runnable object
		Runnable randomNumberTask1 = new RandomNumberTask(1,100);
		Runnable randomNumberTask2 = new RandomNumberTask(5, 50);
		
		// Create thread objects
		Thread randomNumberThread1 = new Thread(randomNumberTask1);
		Thread randomNumberThread2 = new Thread(randomNumberTask2);
		
		randomNumberThread2.setName("taskPrintRandNumber2");

		// Execute threads
		randomNumberThread1.start();
		randomNumberThread2.start();

		System.out.println("Program ends");


	}

}
