package Threads;

/*** @author DAthCore */

public class ThreadSleep {
	public static void main(String[] args) throws InterruptedException {
		String importantInfo[] = {"One", "Two", "Three", "Four"};
		
		for (int i = 0; i < importantInfo.length; i++) {
			//Pause for 4 seconds
			Thread.sleep(4000);//Every 4 seconds print the text number
			System.out.println(importantInfo[i]);
		}
	}
}
