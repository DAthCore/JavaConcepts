package Threads;

/*** @author DAthCore */

public class MyThread {
	public static void main(String[] args) {
		Thread t = Thread.currentThread();
		System.out.println("Thread Name: " + t.getName());
		t.setName("My Thread");
		System.out.println("Thread Name: " + t.getName());
		System.out.println("Thread ID: " + t.getId());
		t.setPriority(4);
		System.out.println("Thread Priority: " + t.getPriority());
		
		//t.setPriority(Thread.MIN_PRIORITY); //MIN_PRIORITY = 1
		//t.setPriority(Thread.NORM_PRIORITY); //NORM_PRIORITY = 5
		//t.setPriority(Thread.MAX_PRIORITY); //MAX_PRIORITY = 10
		
		System.out.println("Thread State: " + t.getState());
	}
}
