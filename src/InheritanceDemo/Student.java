package InheritanceDemo;

/*** @author DAthCore */

public class Student extends Person {
	
	private String nameOfUniversity;
	
	public Student (int age, String name, String nameOfUniversity) {
		super (age, name);
		this.nameOfUniversity = nameOfUniversity;		
	}
	
	public void showStudent() {
		System.out.println("Student Name: " + name);
		System.out.println("Age: " + age);
		System.out.println("University: " + nameOfUniversity);
	}
	
	public void showAge ( ) {
		super.showAge();
	}
}
