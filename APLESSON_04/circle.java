import java.util.Scanner;
public class circle
{
	static double r;
	static double area;
	
	public static void main(String[]args)
	{
		Scanner kb = new Scanner(System.in);
		circle form = new circle();
		System.out.println("enter the radius");
		r = kb.nextDouble();
		
		
		
		calcArea();
		print();
	}
	public static void calcArea()
	{
		area = 3.14*r*r;
	}
	public static void print()
	{
		System.out.printf("The area of the circle with a radius of " + r + " is %5.5f" , area);
	}
}