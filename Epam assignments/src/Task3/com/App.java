package Task3.com;
import java.util.*;
public class App {
	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("1.Addition\n2.Subtraction\n3.Multipication\n4.Division\n");
		System.out.println("Enter the operation number which you want to perform: ");
		int N =sc.nextInt();
		if(N<1 || N>4)
		{
			System.out.println("Enter valid operation number.");
			System.exit(0);
		}
		System.out.println("Enter two operands to perform the operation: ");
		int x=sc.nextInt();
		int y=sc.nextInt();
		Calculate c=new Calculate(x,y);
		int result=0;
		switch(N)
		{
			case 1:
				result=c.add();
				System.out.println("Addition of two numbers is: "+result);
				break;
			case 2:
				result=c.subtract();
				System.out.println("Subtraction of two numbers is: "+result);
				break;
			case 3:
				result=c.multiply();
				System.out.println("Multiplication of two numbers is: "+result);
				break;
			case 4:
				if(y==0)
				{
					System.out.println("Please, Enter a valid number");
				}
				else
				{
					result=c.divide();
					System.out.println("Division of two numbers is: "+result);
				}
				break;
		}
	}
}
