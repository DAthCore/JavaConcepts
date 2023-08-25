package EncapsulationDemo;

/**
 * @author DAthCore
 * 
 * Encapsulation in java is a Mechanism of wrapping the data (variables) and code acting on the data (methods) together as a single unit.
 * Variables of a class will be  hidden from other classes, and can be accessed only through the methods of their current class.
 * Declare the variables of a class as private.
 * Provide public setter and getter methods to modify and view the variables values.
 */

class Encap {
	
	private String name;
	private String studentID;
	private int mark;
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getStudentID() {
		return studentID;
	}
	public void setStudentID(String studentID) {
		this.studentID = studentID;
	}
	public int getMark() {
		return mark;
	}
	public void setMark(int mark) {
		this.mark = mark;
	}
	
}


public class EncapsulationDemo {

	public static void main(String[] args) {
		Encap en = new Encap();
		en.setName("DAthCore");
		System.out.println("Name: "+en.getName());

	}

}
