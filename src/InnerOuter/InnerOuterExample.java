package InnerOuter;

import StaticMethods.Ticket;

/*** @author DAthCore */

class OuterClass {
	public void show() {
		System.out.println("Inside Outer Class" + "\n");
	}
	
	class InnerClass {
		public void show() {
			System.out.println("Inside Inner Class");
		}
	}
}

public class InnerOuterExample {
	public static void main(String[] args) {
		OuterClass oc = new OuterClass();
		oc.show();
		//You can't create inner class objects directly
		//You need  to refer Outer class firts to create inner class objects
		OuterClass.InnerClass in = oc.new InnerClass();
		in.show();
		//OuterClass.InnerClass in1 = oc.new InnerClass();

	}

}
