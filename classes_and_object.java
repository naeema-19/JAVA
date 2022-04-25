/* Write two Java classes Employee and Engineer. Engineer should inherit from Employee
class. Employee class to have two methods display() and calcSalary(). Write a program to
display the engineer salary and to display from Employee class using a single object instantiation (i.e., only one object creation is allowed).
● display() only prints the name of the class and does not return any value. Ex. “ Name
of class is Employee.”
● calcSalary() in Employee displays “Salary of employee is 10000” and calcSalary() in
Engineer displays “Salary of employee is 20000.”*/
class emp{
	void display() {
		System.out.println("Nmae of class is Employeee....");
	}
	void calcSalary() {
		System.out.println("Salary of Employee is 10000");
	}
}

class eng extends emp{
	void dispaly2() {
		super.display();
		super.calcSalary();
	
		System.out.println("Nmae of class is Engineer....");
		System.out.println("Salary of Engineer is 20000");
	}
	
	
}

public class class_obj {

	public static void main(String[] args) {
		eng obj1 = new eng();
		obj1.display();
		obj1.calcSalary();
		obj1.dispaly2();
		
		
		

	}

}
