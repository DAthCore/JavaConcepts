package InheritanceDemo;

/**
 * @author DAthCore
 */

class Calculation {
	int result;
	
	public void addition (int x, int y) {
		result = x + y;
		System.out.println("The Sum Is: " + result);
	}
	
	public void Subtraction (int x, int y) {
		result = x - y;
		System.out.println("The Difference Between The Given Numbers: " + result);
	}
}


public class MyCalculation extends Calculation {
	public void multiplication(int x, int y) {
		result = x * y;
		System.out.println("The Product Of The Given Numbers: " + result);
	}

	public static void main(String[] args) {
		int a = 20, b = 10;
		MyCalculation demo = new MyCalculation();
		demo.addition(a, b);
		demo.Subtraction(a, b);
		demo.multiplication(a, b);

	}

}
