package RandomNumber;


import java.util.Random;

/**
 * This class represent a task to generate a random number.
 * 
 * @author emalianakasmuri
 *
 */
public class RandomNumberTask implements Runnable  {
	
	private Random random;
	private int min;
	private int max;
	
	public RandomNumberTask (int min, int max) {
		
		random = new Random();
		
		this.min = min;
		this.max = max;
	}
	
	/**
	 * This method gets a random number between min and max values
	 * 
	 * @return a random number
	 */
	public int getRandomNumber () {
		
		int number = random.nextInt(max-min) + min;
		
		return number;
	}

	@Override
	public void run() {
		// TODO Auto-generated method stub
		try {
			for(int counter=0; counter<10; counter++)
				System.out.println(Thread.currentThread().getName() + " " + getRandomNumber());
			Thread.sleep(5000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		System.out.println("Task Finished");
	}	
}
