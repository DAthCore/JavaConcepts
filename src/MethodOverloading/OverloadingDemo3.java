package MethodOverloading;

/**
 * @author DAthCore
 */

class OverloadDemo3 {
	public void display (char c, int num) {
		System.out.println("Inside The First Definition of Method Disp");
	}
	
	public void display (int num, char c) {
		System.out.println("Inside The Second Definition of Method Disp");
	}
	
}

public class OverloadingDemo3 {

	public static void main(String[] args) {
		OverloadDemo3 obj = new OverloadDemo3();
		obj.display('x', 26);
		obj.display(26, 'x');

	}

}
