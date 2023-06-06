package CurrentTime;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Calendar;

/**
 * This class represent a task to print current time
 * 
 * @author emalianakasmuri
 *
 */
public class CurrentTimeTask extends Thread{
	
	private DateFormat dateFormat;
	private Calendar calendar;
	
	public CurrentTimeTask() {
		
		dateFormat = new SimpleDateFormat("yyyy/MM/dd HH:mm:ss.ms");
		calendar = Calendar.getInstance();
	}
	
	/**
	 * This method gets a current time
	 * 
	 * @return a current time
	 */
	public String getCurrentTime() {
		
		return dateFormat.format(calendar.getTime());
	}
	
	public void run() {
		
		try {
			for(int counter = 0; counter < 10; counter++) {
				sleep(4000);
				System.out.println(getName() + " " + getCurrentTime());
			}
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}
	

}

