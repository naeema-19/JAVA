class overload{
	void area(double x)
	{
		System.out.println("Area of circle = " + 3.14*x*x);
	}
	void area(int x, int y)
	{
		System.out.println("Area of Triangle = " + 0.5*x*y);
	}
	void area(float x, float y)
	{
		System.out.println("Area of Rectangle = " + x*y);
	}
}

public class overloading {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		overload obj = new overload();
		System.out.print("Enter the radius : ");
		double r = sc.nextDouble();
		obj.area(r);
		System.out.print("Enter the length and breadth : ");
		float a = sc.nextFloat();
		float b = sc.nextFloat();
		obj.area(a,b);
		System.out.print("Enter the Height and Base = ");
		int a1 = sc.nextInt();
		int b1 = sc.nextInt();
		obj.area(a1,b1);
		


	}

}
