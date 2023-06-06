package com.java.main;
import CurrentTime.CurrentTimeTask;
import RandomNumber.RandomNumberTask;
public class CurrentTimeRandomNumberApp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		RandomNumberTask randNumberTask1 = new RandomNumberTask(1, 10);
		RandomNumberTask randNumberTask2 = new RandomNumberTask(90, 100);
		CurrentTimeTask currentTimeTask1 = new CurrentTimeTask();
		
		Thread randomNumberThread1 = new Thread(randNumberTask1);
		Thread randomNumberThread2 = new Thread(randNumberTask2);
		
		//set thread name
		randomNumberThread1.setName("randNumberTask1");
		randomNumberThread2.setName("randNumberTask2");
		currentTimeTask1.setName("currentTimeTask1");
		
		randomNumberThread1.start();
		randomNumberThread2.start();
		currentTimeTask1.start();
		
		System.out.println("Program End");
	}

}
