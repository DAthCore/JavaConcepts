package Threads;

import java.util.Iterator;

/*** @author DAthCore */

class Value {
	synchronized void printValue (int n) { //Synchronized method
		for (int i = 1; i <= 10; i++) {
			//System.out.println("i = " + i);
			System.out.println(n * i);
			try {
				Thread.sleep(400);
			} catch (Exception e) {
				System.out.println(e);
			}
		}
		
	}
}  

class MyThread1 extends Thread {
	Value v;
	MyThread1(Value v){
		this.v = v;
	}
	public void run() {
		v.printValue(5);
	}
}

class MyThread2 extends Thread {
	Value v;
	MyThread2(Value v){
		this.v = v;
	}
	public void run() {
		v.printValue(100);
	}
}

public class SynchronizationMethodDemo {

	public static void main(String[] args) {
		Value obj = new Value(); //Only the object
		MyThread1 t1 = new MyThread1(obj);
		MyThread2 t2 = new MyThread2(obj);
		t1.start();
		t2.start();

	}

}
