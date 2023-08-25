package MethodOverloading;

/**
 * @author DAthCore
 */

class OverloadDemo2 {
	public void display (char c) {
		System.out.println(c);
	}
	
	public void display (int c) {
		System.out.println(c);
	}
	
}

public class OverloadingDemo2 {

	public static void main(String[] args) {
		OverloadDemo2 obj = new OverloadDemo2();
		obj.display('a');
		obj.display(26);

	}

}
