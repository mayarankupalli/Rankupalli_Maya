import java.util.Scanner;
public class scope
{
	static String var1 = "your numbers are...";
	static int var2;
	static double var3;
	
	
	public static void main(String[]args)
	{
		Scanner kb = new Scanner(System.in);
		System.out.println("please enter an integer:");
		var2 = kb.nextInt();
		System.out.println("please enter a double");
		var3 = kb.nextDouble();
		method1();
		
	}
	
	public static void method1()
	{
		System.out.println(var1 + var2 + "and" + var3  );
	}
}