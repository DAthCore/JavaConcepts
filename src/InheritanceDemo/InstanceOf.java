package InheritanceDemo;

/*** @author DAthCore */

class Vehicle {	
}

class Car extends Vehicle {	
}

class Van extends Vehicle {	
}

class VolksWagen extends Car {	
}

public class InstanceOf extends Car{

	public static void main(String[] args) {
		Vehicle v = new Vehicle();
		Car c = new Car();
		Van va = new Van();
		VolksWagen vw = new VolksWagen();
		
		System.out.println(c instanceof Vehicle);
		System.out.println(va instanceof Vehicle);
		System.out.println(vw instanceof Car);
		
		System.out.println(vw instanceof Vehicle);
	}

}
