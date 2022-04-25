import java.util.*;
abstract class shape{
	abstract void numberOfsides();
}
class Triangle extends shape{
	void numberOfsides() {
		System.out.println("No of sides is 3");	
	}
	
}
class Rectangle extends shape{
	void numberOfsides() {
		System.out.println("No of sides is 4");	
	}
	
}
class Hexagon extends shape{
	void numberOfsides() {
		System.out.println("No of sides is 6");	
	}
	
}

public class abstract_polymor {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int ch;
		
		do
		{
			System.out.println("Enter ur choice\n1. Triangle\n2. Rectangle\n3. Hexagon\n4. Exit");
			ch = sc.nextInt();
			switch(ch)
			{
			case 1:
				shape tobj = new Triangle();
				tobj.numberOfsides();
				break;
			case 2:
				shape robj = new Rectangle();
				robj.numberOfsides();
				break;
			case 3:
				shape hobj = new Hexagon();
				hobj.numberOfsides();
				break;
			case 4:
				
				break;
			default:
				System.out.println("Invalid Choice");
			}
		}
		while(ch!=4);
		

	}

}
