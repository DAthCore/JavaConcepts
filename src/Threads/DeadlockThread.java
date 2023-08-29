package Threads;

/*** @author DAthCore */

public class DeadlockThread {

	public static void main(String[] args) {
		final String resource1 = "Diego Alt"; //Locked by t1
		final String resource2 = "CDMX, Mexico"; //Locked by t2
		
		//t1 tries to look resource1 then resource2
		Thread t1 = new Thread() {
			public void run() {
				synchronized (resource1) {
					System.out.println("Thread 1: Locked Resource 1");
					
					try {
						Thread.sleep(100);
					} catch (Exception e) {
						// TODO: handle exception
					}
					
					synchronized (resource2) {
						System.out.println("Thread 1: Locked Resource 2");
					}
				}
			}
		};
		
		//t2 tries to look resource2 then resource1
		Thread t2 = new Thread() {
			public void run() {
				synchronized (resource2){
					System.out.println("Thread 2: Locked Resource 2");
					
					try {
						Thread.sleep(100);
					} catch (Exception e) {
						// TODO: handle exception
					}
					
					synchronized (resource1) {
						System.out.println("Thread 2: Locked Resource 1");
					}
				}
			}
		};
		
		t1.start();
		t2.start();

	}

}
