package InheritanceDemo;

/*** @author DAthCore */

public class Inheritance {
	
	/* Inheritance -> When a given class acquires the properties of another class
	 *			// methods and variables 
	 * Class that inherits: subclass / derived class / child class
	 * Class whose properties are inherited: superclass / parent class
	 * 
	 * super keyword -> with this keyword we can  call the parent class
	 * 	For example: same method name in both classes we can differentiate the members with super INHERITANCE IS A RELATIONSHIP	 * 
	 * */

	public static void main(String[] args) {
		Student s = new Student(26, "DAthCore", "MIT");
		s.showStudent();
		s.showAge();
	}

}
