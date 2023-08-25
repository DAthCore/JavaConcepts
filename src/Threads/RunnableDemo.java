package Threads;

/*** @author DAthCore */

public class RunnableDemo implements Runnable {
	public void run() {
		System.out.println("Thread Is Running...");
	}

	public static void main(String[] args) {
		RunnableDemo rd = new RunnableDemo();
		Thread t = new Thread(rd);
		t.start();
	}
}
