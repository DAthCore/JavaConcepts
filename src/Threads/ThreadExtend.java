package Threads;

/*** @author DAthCore */

public class ThreadExtend extends Thread {

	public void run() {
		System.out.println("Thread Is Running...");
	}

	public static void main(String[] args) {
		ThreadExtend t1 = new ThreadExtend();
		t1.start();
	}
}