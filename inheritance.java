import java.util.*;
class employee{
	String name;
	double phn;
	int age;
	String addr;
	double sal;
	void printSalary()
	{
		System.out.println("Salary of employee is" + sal);
	}
}
class officer extends employee{
	String spec;
	
}
class manager extends employee{
	String dept;
	
}

public class inheritance {

	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
			officer oobj = new officer();
			manager mobj = new manager();
			System.out.println("Enter the details of Officer");
			System.out.println("Enter the name of Officer");
			oobj.name=sc.nextLine();
			System.out.println("Enter the salary of Officer");
			oobj.sal=sc.nextDouble();
			System.out.println("Enter the age of Officer");
			oobj.age=sc.nextInt();
			System.out.println("Enter the phn no of Officer");
			oobj.phn=sc.nextDouble();
			System.out.println("Enter the address of Officer");
			oobj.addr=sc.nextLine();
			System.out.println("Enter the Specialization of Officer");
			oobj.spec=sc.nextLine();
			System.out.println("Enter the details of Manager");
			System.out.println("Enter the name of Manager");
			mobj.name=sc.nextLine();
			System.out.println("Enter the salary of Manager");
			mobj.sal=sc.nextDouble();
			System.out.println("Enter the age of Manager");
			mobj.age=sc.nextInt();
			System.out.println("Enter the phn no of Manager");
			mobj.phn=sc.nextDouble();
			System.out.println("Enter the address of Manager");
			mobj.addr=sc.nextLine();
			System.out.println("Enter the Department of Manager");
			mobj.dept=sc.nextLine();
			System.out.println("Officer details");
			System.out.println("name : " + oobj.name);
			System.out.println("salary : " + oobj.sal);
			System.out.println("age : " + oobj.age);
			System.out.println("phn no : " + oobj.phn);
			System.out.println("address : " + oobj.addr);
			System.out.println("specialization : " + oobj.spec);
			
			System.out.println("Manager details");
			System.out.println("name : " + mobj.name);
			System.out.println("salary : " + mobj.sal);
			System.out.println("age : " + mobj.age);
			System.out.println("phn no : " + mobj.phn);
			System.out.println("address : " + mobj.addr);
			System.out.println("department : " + mobj.dept);
	}

}
